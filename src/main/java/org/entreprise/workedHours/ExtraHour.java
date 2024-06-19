package org.entreprise.workedHours;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public final class ExtraHour extends WorkedHour {
    public ExtraHour(String name, float hourlyRate) {
        super(name, hourlyRate);
    }
}
