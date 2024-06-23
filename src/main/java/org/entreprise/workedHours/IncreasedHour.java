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
    private String type; //for example night, sunday or public holiday
    public IncreasedHour(String nom, int value, String type) {
        super(nom, value);
        this.type = type;
    }
}
