package testesUnitarios.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import testesUnitarios.enuns.EnumSexo;

@Getter
@Setter
@RequiredArgsConstructor
public class Pessoa {
	
	private Integer id;
	@NonNull
	private String nome;
	@NonNull
	private Integer idade;
	@NonNull
	private EnumSexo sexo;
}
