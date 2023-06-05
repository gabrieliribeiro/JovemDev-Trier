package ex002.models;

import ex002.enums.EnumFormacao;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Professor {
    @NonNull
    private String nome;
    @NonNull
    private EnumFormacao formacao;


}
