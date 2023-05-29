package terceira_aula.prova_livro;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.util.List;

@Getter
@Setter
public class Autor {
    private String nome;
    private int idade;
    private EnumSexo sexo;

    public void cadastroAutor(){
        setNome(JOptionPane.showInputDialog("Informe o nome do autor: "));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do autor: ")));
        setSexo(Utilities.escolheGenero());

        if (validaDados()){
            cadastroAutor();
        }

        JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!");
    }

    boolean validaDados(){
        String[] partesNome = getNome().split(" ");
        if (partesNome.length < 2){
            JOptionPane.showMessageDialog(null, "Está faltando o sobrenome!");
            return true;
        }
        if(getIdade()< 6) {
        	JOptionPane.showMessageDialog(null, "A idade não pode ser negativa! E o autor tem que ter mais que 6 anos!");
            return true;
        }
        return false;
    }

    public String toString(){
        return "Nome do autor: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Gênero: " + sexo.getDescricao() + "\n";
    }

}
