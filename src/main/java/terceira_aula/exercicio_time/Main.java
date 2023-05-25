package terceira_aula.exercicio_time;

import segunda_aula.exercicio_carro.Carro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Time> listaTime = new ArrayList<Time>();

    public static void main(String[] args) {

        int opcao = 0;

        do {
            opcao = Utilities.escolheOpMenu();
            switch (opcao) {
                case 1:
                    Time time = new Time();
                    time.cadastroTime();
                    listaTime.add(time);
                    int opcaoCadastraMaisJogador = 0;
                    do{
                        opcaoCadastraMaisJogador = Utilities.menuCadastroJogadores();
                        if (opcaoCadastraMaisJogador==1){
                            time.cadastrarJogador();
                        }else{
                            JOptionPane.showMessageDialog(null, "Encerrando cadastro jogador");
                        }
                    } while (opcaoCadastraMaisJogador != 2);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, Utilities.verificarArtilheiro(listaTime));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, Utilities.verificarTimeComMaisGols(listaTime));
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 4);

    }
}
