package org.entreprise.workedHours;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class IncreasedHour extends WorkingHour {
    private String type;
    public IncreasedHour(String nom, float tauxHoraire, String type) {
        super(nom, tauxHoraire);
        this.type = type;
    }
}
