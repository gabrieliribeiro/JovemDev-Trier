package segunda_aula.exercicio_carro;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumCor {
	VERMELHO(1, "Vermelho"), 
	BRANCO(2, "Branco"), 
	PRATA(3, "Prata"), 
	PRETO(4, "Preto");
	
	public int codigo;
	public String descricao;
	
	public static EnumCor findById(int codigo) {
		for (EnumCor cor : EnumCor.values()) {
			if (codigo == cor.codigo) {
				return cor;
			}
		}
		return null;
	}
	
}
