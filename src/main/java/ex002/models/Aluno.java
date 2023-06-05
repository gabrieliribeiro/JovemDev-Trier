package ex002.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Aluno {
    @NonNull
    private String nome;
    @NonNull
    private Disciplina disciplina ;
    @NonNull
    private Double notas;
    
    public Aluno(String nome) {
    	setNome(nome);
	}

 
}
