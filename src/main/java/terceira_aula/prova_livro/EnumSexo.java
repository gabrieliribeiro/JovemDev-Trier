package terceira_aula.prova_livro;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumSexo {
    MASCULINO(1, "Masculino"),
    FEMININO(2, "Femenino");

    public int codigo;
    public String descricao;

    public static EnumSexo findById(int codigo){
        for (EnumSexo sexo: EnumSexo.values()) {
            if (codigo == sexo.codigo){
                return sexo;
            }
        }
        return null;
    }

}
