package repositoryEx02;

import ex002.enums.EnumFormacao;
import ex002.models.Aluno;
import ex002.models.Disciplina;
import ex002.models.Professor;
import ex002.repository.BancoDados;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BancoDadosTest {

    private BancoDados bd = new BancoDados();

    @BeforeEach
    void Init(){
    	bd.clearDataProfessor();
    	Professor p1 = bd.cadastrarProfessor("Professor 1", EnumFormacao.ESPECIALIZACAO);
    	Professor p2 = bd.cadastrarProfessor("Professor 2", EnumFormacao.GRADUACAO);
    	Professor p3 = bd.cadastrarProfessor("Professor 3", EnumFormacao.POS_GRADUACAO);
    	
    	bd.clearDataAluno();
    	Aluno a1 = bd.cadastrarAluno("Aluno 1");
    	Aluno a2 = bd.cadastrarAluno("Aluno 2");
    	Aluno a3 = bd.cadastrarAluno("Aluno 3");
    	
    	bd.clearDataDisciplina();
    	Disciplina d1 = bd.cadastrarDisciplina("Português", 80, p2);
    	Disciplina d2 = bd.cadastrarDisciplina("Matemática", 85, p3);
    	Disciplina d3 = bd.cadastrarDisciplina("Biologia", 75, p1);
    	
    }
    
    @Test
    @DisplayName("Testando listagem Professor")
    void testeCadastroProfessor() {
    	List<Professor> cad = bd.listAllProfessores();
    	assertEquals(3, cad.size());
    	assertEquals("Professor 1", cad.get(0).getNome());
    	bd.cadastrarProfessor("Professor 4", EnumFormacao.GRADUACAO);
    	cad = bd.listAllProfessores();
    	assertEquals(4, cad.size());
    	assertEquals("Professor 4", cad.get(3).getNome());
    }
    
    @Test
    @DisplayName("Testando listagem Aluno")
    void testeCadastroAluno() {
    	List<Aluno> cad = bd.listAllAlunos();
    	assertEquals(3, cad.size());
    	assertEquals("Aluno 1", cad.get(0).getNome());
    	bd.cadastrarAluno("Aluno 4");
    	cad = bd.listAllAlunos();
    	assertEquals(4, cad.size());
    	assertEquals("Aluno 4", cad.get(3).getNome());
    }
    
    
    @Test
    @DisplayName("Testando listagem disciplinas")
    void testeCadastroDisciplinas() {
    	List<Disciplina> cadastro = bd.listAllDisciplinas();
    	assertEquals(3, cadastro.size());
    	assertEquals("Português", cadastro.get(0).getNome());
    	Professor edFisica = bd.cadastrarProfessor("Professor Ed. Física", EnumFormacao.GRADUACAO);
    	bd.cadastrarDisciplina("Ed. Física", 90, edFisica);
    	cadastro = bd.listAllDisciplinas();
    	assertEquals(4, cadastro.size());
    	assertEquals("Ed. Física", cadastro.get(3).getNome());
    	
    }
    
    @Test
    @DisplayName("Testando cadastro disciplina no aluno")
    void testeCadastroDisciplinaDoAluno() {
  
    }
    
    @Test
    @DisplayName("Testando listagem disciplina com profs com pós")
    void testeListaDisciplinaComProfPos() {
 
    }

}
