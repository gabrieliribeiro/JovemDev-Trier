package ex001.models;

import ex001.enums.EnumAdministracao;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {

    private String nome;
    private EnumAdministracao administracao;
    private List<String> contraIndicacoes = new ArrayList<>();
    private List<String> indicacoes = new ArrayList<>();



}
