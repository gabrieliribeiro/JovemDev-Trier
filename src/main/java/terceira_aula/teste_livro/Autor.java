package terceira_aula.teste_livro;

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

        if (validaNaoTemSobrenome()){
            cadastroAutor();
        }

        JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!");
    }

    List<Autor>autorLista;
    public String listaDeAutores() {
        String ret = "Autores : " + getNome() + "\n";
        for (Autor autor : autorLista) {
            ret += autor;
        }
        return ret;
    }

    boolean validaNaoTemSobrenome(){
        String[] partesNome = getNome().split(" ");
        if (partesNome.length < 2){
            JOptionPane.showMessageDialog(null, "Está faltando o sobrenome!");
            return true;
        }
        return false;
    }

    public String tosString(){
        return "Nome do autor: " + getNome() + "\n"
                + "Idade: " + getIdade() + "\n"
                + "Gênero: " + sexo.getDescricao() + "\n"
                + "__________\n";
    }

}
