package segunda_aula.exercicio_carro;

public enum EnumCor {
	VERMELHO(1, "Vermelho"), 
	BRANCO(2, "Branco"), 
	PRATA(3, "Prata"), 
	PRETO(4, "Preto");
	
	public int codigo;
	public String descricao;
	
	
	private EnumCor(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static EnumCor findById(int codigo) {
		for (EnumCor cor : EnumCor.values()) {
			if (codigo == cor.codigo) {
				return cor;
			}
		}
		return null;
	}
	
}
