package org.entreprise;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class Salaire {
    private final double salaireBrut;
    private double salaireNet;

    public Salaire(float salaireBrut) {
        this.salaireBrut = salaireBrut;
        this.salaireNet = this.salaireBrut - this.salaireBrut * 0.2;
    }
}
