package ex002.repository;

import ex002.enums.EnumFormacao;
import ex002.models.Aluno;
import ex002.models.Disciplina;
import ex002.models.Professor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BancoDados {

    private List<Aluno> dadosAluno = new ArrayList<Aluno>();
    private List<Professor> dadosProfessor = new ArrayList<Professor>();
    private List<Disciplina> dadosDisciplina = new ArrayList<Disciplina>();

    public Aluno cadastrarAluno(String nome) {
        Aluno aluno = new Aluno(nome);
        dadosAluno.add(aluno);
        return aluno;
    }

    public List<Aluno> listAllAlunos() {
        return dadosAluno;
    }
    public void cadastraDisciplinaAluno(Aluno aluno, Disciplina disciplina) {
    	
    			
		
	}

    public void clearDataAluno() {
        dadosAluno.clear();
    }

    public Professor cadastrarProfessor(String nome, EnumFormacao formacao) {
        return null;
    }

    public List<Professor> listAllProfessores() {
        return dadosProfessor;
    }

    public void clearDataProfessor() {
        dadosProfessor.clear();
    }

    public Disciplina cadastrarDisciplina(String nome, int cargaHoraria, Professor professor) {
       return null;
    }
    
    public List<Disciplina> listAllDisciplinas() {
        return dadosDisciplina;
    }

    public void clearDataDisciplina() {
        dadosDisciplina.clear();
    }
}
