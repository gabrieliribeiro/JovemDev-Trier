package segunda_aula.exercicio_carro;

import lombok.Getter;
import lombok.Setter;

import javax.swing.JOptionPane;

@Getter
@Setter
public class Carro {
    private String marca;
    private int ano;
    private EnumCor cor;

    public void cadastra() {
        setMarca(JOptionPane.showInputDialog("Informe a marca do carro: ").toUpperCase());
        setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: ")));
        setCor(Utilities.escolheCor());
        if (!validacao()) {
            cadastra();
        }
    }

    public boolean validacao() {
        if (getMarca().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "A marca deve ser preenchida");
            return false;
        }
        if (getAno() < 0 || getAno() > 2023) {
            JOptionPane.showMessageDialog(null, "Não há carros com esse período de fabricação");
            return false;
        }
        if (getCor() == null) {
            JOptionPane.showMessageDialog(null, "A cor é inválida");
            return false;
        }
        return true;
    }

    public boolean isPeriodoFabricacao(int inicio, int fim) {
        return getAno() >= inicio && getAno() <= fim;
    }

    public boolean isMarca(String buscaMarca) {
        return buscaMarca.equalsIgnoreCase(this.marca);
    }

    public boolean isCor(EnumCor buscaCor) {
        return buscaCor == this.cor;
    }

    public String toString() {
        return "\n|- Marca: " + getMarca()
                +"\n|- Ano: " + getAno()
                +"\n|- Cor: " + cor.getDescricao()
                +"\n|__________|\n";
    }

}
