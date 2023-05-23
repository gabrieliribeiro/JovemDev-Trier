package segunda_aula;

import java.text.DecimalFormat;

public class Pessoa {
    private String nome;
    private char sexo;
    private double peso, altura, imc;
    private String categoriaImc;

    DecimalFormat df = new DecimalFormat("0.00");

    public Pessoa(String nome, char sexo, double peso, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //pegar no git do prof clavison a correcao
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setImc() {
        imc = getPeso() / (getAltura() * getAltura());

        this.imc = imc;
    }
	
    public void situacaoImc() {
        if (this.sexo == 'F') {
            if (imc <= 19.1) {
                categoriaImc = "Abaixo do peso";
            } else if (imc <= 25.8) {
                categoriaImc = "Peso ideal";
            }else if (imc <=  27.3) {
                categoriaImc = "Pouco acima do peso";
            }else if (imc <= 32.3) {
                categoriaImc = "Acima do peso";
            }else{
                categoriaImc = "Obesidade";
            }
        } else if (this.sexo == 'M') {
            if (imc < 20.7) {
                categoriaImc = "Abaixo do peso";
            } else if (imc <= 26.4) {
                categoriaImc = "Peso ideal";
            }else if (imc <=  27.8) {
                categoriaImc = "Pouco acima do peso";
            }else if (imc <= 31.1) {
                categoriaImc = "Acima do peso";
            }else{
                categoriaImc = "Obesidade";
            }
        }

    }

    public void exibeDados() {
        System.out.println("|----- Cadastro! -----|"
                + "\n|- Nome: " + this.nome
                + "\n|- IMC: " + df.format(this.imc)
                + "\n|- Situação do IMC: " + categoriaImc
        );

    }
	
}
