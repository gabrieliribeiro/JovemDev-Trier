package primeira_aula;

import java.text.DecimalFormat;

public class Pessoa {
    private String nome;
    private char sexo;
    private double peso;
    private double altura;
    private double imc;
    private String categoriaImc;

    DecimalFormat df = new DecimalFormat("0.00");

    public Pessoa(String nome, char sexo, double peso, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

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
	
    public void situacaoImc(double imcSituacao) {
        if (this.sexo == 'F') {
            if (imc <= 19.1) {
                categoriaImc = "Abaixo do peso";
            } else {
                System.out.println("Normal");
            }
        } else if (this.sexo == 'M') {

        }

    }

    public void exibeDados() {
        System.out.println("|----- Cadastro! -----|"
                + "\n|- Nome: " + this.nome
                + "\n|- IMC: " + df.format(this.imc)
                + "\n|- Situação do IMC: "
        );

    }
	
}
