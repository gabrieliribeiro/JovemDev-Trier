package ex001.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumAdministracao {

    ORAL(),
    INJETAVEL(),
    TOPICO(),
    SUPOSITORIO();

}
