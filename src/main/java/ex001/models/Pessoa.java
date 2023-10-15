package ex001.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Pessoa {
    private String nome;
    private String sintoma;
    private List<String> condicaoDeSaude = new ArrayList<>();
    private List<Medicamento> medicamentos = new ArrayList<>();


}
