package primeira_aula;

public class Pessoa {
	private String nome;
	private char sexo;
	private double peso;
	private double altura;
	private double imc;
	
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

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

	public void setImc() {
		imc = getPeso()/(getAltura()*getAltura());
		
		this.imc = imc;
		
	}

	public void exibeDados() {
		System.out.println(this.imc);
	}
	
}
