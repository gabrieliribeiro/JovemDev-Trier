-- 1: Selecionar todos os registros e atributos da entidade cargo.

select * from cargo c ;

-- 2: Selecionar a quantidade de vereadores da entidade cidade, ordenado pelo nome da cidade

select cid.nome, cid.qt_vereadores from cidade cid order by cid.nome;

-- 3: Selecionar a quantidade de vereadores da entidade cidade, somente das cidades que possuem mais de 9 vereadores

select cid.nome, cid.qt_vereadores from cidade cid
where  cid.qt_vereadores > 9
order by cid.nome;

-- 4: Selecionar quantas cidades possuem mais de 9 vereadores

select count(*)  from cidade cid
where  cid.qt_vereadores > 9;

-- 5: Selecionar a quantidade máxima de vereadores que uma cidade possui

select max(qt_vereadores) from cidade;

-- 6: Selecionar o nome da cidade que possui mais vereadores

select cid.nome from cidade cid
where qt_vereadores = (select max(qt_vereadores) from cidade);

-- 7: Selecionar o nome dos candidatos a prefeito ordenados pelo nome

select can.nome from candidato can 
where cargo = 1
order by can.nome;

-- 8: Selecionar o nome dos candidatos a vereador que possuem "maria" no nome ordenados pelo nome

select nome from candidato 
where cargo = 2
and nome like '%MARIA%'
order by nome;

-- 9: Selecionar o nome dos candidatos a vereador que iniciam com 'Y' - ordenado pelo nome:

select nome from candidato 
where cargo = 2
and nome like 'Y%'
order by nome;

-- 10: Selecionar o nome dos candidatos a prefeito de cada cidade, ordenado pelo nome da cidade e em seguida pelo nome do candidato:

select 
	cidade.nome, candidato.nome
from 
	cidade
inner join candidato 
	on candidato.cidade = cidade.id 
	and candidato.cargo = 1
order by 
	cidade.nome, candidato.nome;
	
-- 11: Selecionar o nome dos candidatos a prefeito da cidade de 'TUBARÃO', ordenado pelo nome do candidato

select 
	cidade.nome, candidato.nome
from 
	cidade
inner join candidato 
	on candidato.cidade = cidade.id 
	and candidato.cargo = 1
where
	cidade.nome = 'TUBARÃO'
order by 
	cidade.nome, candidato.nome;

-- 12: Selecionar o nome dos candidatos a prefeito da cidade que tem o maior número de eleitores.

select 
	cidade.nome , candidato.nome
from 
	cidade
inner join candidato 
	on candidato.cidade = cidade.id 
	and candidato.cargo = 1
where
	 qt_eleitores = (select max(qt_eleitores) from cidade)
order by 
	cidade.nome, candidato.nome;

-- 13: Selecionar a quantidade de candidatos a vereador da cidade de 'TUBARÃO’

select 
	count(*) as quantidade_vereadores
from 
	cidade
inner join candidato 
	on candidato.cidade = cidade.id 
where
	cidade.nome = 'TUBARÃO' and candidato.cargo = 2;

--  busca do prof 
select 
	count(*)
from 
	candidato c
inner join cidade
	on cidade.id = c.cidade and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = c.cargo and cargo.nome = 'Vereador';

-- 14: Selecionar a quantidade de candidatos a vereador de cada cidade, ordenado pelonome da cidade

select 
	cidade.nome, count(candidato.id) as quantidade_candidatos
from
	cidade
inner join candidato 
	on candidato.cidade = cidade.id 
	and candidato.cargo = 2
group by cidade.nome
order by cidade.nome;


-- 15: Selecionar a quantidade de votos nulos e brancos para prefeito e para vereador da cidade de Tubarão

select 
	cargo.nome, vi.brancos, vi.nulos
from 
	voto_invalido vi
inner join cidade
	on vi.cidade = cidade.id and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = vi.cargo; 	


-- 16: Selecionar a quantidade de votos INVÁLIDOS (BRANCOS + NULOS) para prefeito da cidade de Tubarão.

select 
	 vi.brancos + vi.nulos as invalidaos
from 
	voto_invalido vi
inner join cidade
	on vi.cidade = cidade.id and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = vi.cargo and cargo.nome = 'Prefeito'; 


-- 17: Selecionar a quantidade de votos válidos para cada candidato a prefeito da cidade de Tubarão, ordenados pela maior quantidade de votos.

select candidato.nome, voto.voto
from voto 
inner join candidato 
	on candidato.id = voto.candidato
inner join cargo 
	on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
inner join cidade
	on cidade.id = candidato.cidade and cidade.nome = 'TUBARÃO'
order by voto.voto desc ;

-- 18: Selecionar a quantidade de votos válidos para CADA candidato a vereador da cidade de Tubarão ordenados pela maior quantidade de votos

select candidato.nome, voto.voto
from voto 
inner join candidato 
	on candidato.id = voto.candidato
inner join cargo 
	on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
inner join cidade
	on cidade.id = candidato.cidade and cidade.nome = 'TUBARÃO'
order by voto.voto desc ;

-- 19: Selecionar a maior quantidade de votos para prefeito de cada cidade

select cidade.nome, max(voto.voto)
from voto 
inner join candidato 
	on candidato.id = voto.candidato
inner join cidade 
	on cidade.id = candidato.cidade
inner join cargo
	on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
group by cidade.nome;

-- 20: Selecionar os partidos e a quantidade de votos de cada um na cidade de Tubarão ordenados pela maior quantidade de votos

select partido.sigla, sum(voto.voto) as votos
from voto 
inner join candidato 
	on candidato.id = voto.candidato
inner join cidade 
	on cidade.id = candidato.cidade and cidade.nome = 'TUBARÃO'
inner join partido 
	on partido.id  = candidato.partido
group by partido.sigla
order by votos desc;

