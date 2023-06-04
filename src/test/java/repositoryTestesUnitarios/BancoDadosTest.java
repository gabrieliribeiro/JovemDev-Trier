package repositoryTestesUnitarios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testesUnitarios.enuns.EnumSexo;
import testesUnitarios.models.Pessoa;
import testesUnitarios.repository.BancoDados;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BancoDadosTest {

    private BancoDados bd = new BancoDados();

    @BeforeEach
    void Init() {
        bd.clearData();
        Pessoa p1 = new Pessoa("Pessoa 1", 20, EnumSexo.FEMININO);
        Pessoa p2 = new Pessoa("Pessoa 2", 45, EnumSexo.MASCULINO);
        Pessoa p3 = new Pessoa("Pessoa 3", 35, EnumSexo.FEMININO);
        Pessoa p4 = new Pessoa("Pessoa 4", 24, EnumSexo.MASCULINO);
        bd.add(p1);
        bd.add(p2);
        bd.add(p3);
        bd.add(p4);
    }


    @Test
    @DisplayName("Testando acha por id")
    void testeFindById() {
        Pessoa p = bd.findById(3);
        assertEquals("Pessoa 3", p.getNome());
        assertEquals(35, p.getIdade());
        assertEquals(EnumSexo.FEMININO, p.getSexo());
    }

    void testeFindByIdNaoExistente() {
        Pessoa p = bd.findById(7);
        assertNull(p);
    }

    @Test
    @DisplayName("Testando listagem")
    void testeListAll() {
        List<Pessoa> cadastro = bd.listAll();
        assertEquals(4, cadastro.size());
        assertEquals("Pessoa 1", cadastro.get(0).getNome());
        bd.add(new Pessoa("Pessoa 5", 15, EnumSexo.FEMININO));
        cadastro = bd.listAll();
        assertEquals(5, cadastro.size());
        assertEquals("Pessoa 5", cadastro.get(4).getNome());
    }

    @Test
    @DisplayName("Teste de acha idade")
    void testeFindIdadeBetween() {
        List<Pessoa> cadastro = bd.findByIdadeBetween(20, 30);
        assertEquals(2, cadastro.size());
    }

    @Test
    @DisplayName("Teste acha por gênero")
    void testeFindBySexo() {
        List<Pessoa> cadastro = bd.findBySexo(EnumSexo.FEMININO);
        assertEquals(2, cadastro.size());
        cadastro = bd.findBySexo(EnumSexo.MASCULINO);
        assertEquals(2, cadastro.size());
    }

}
