package org.entreprise.workedHours;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.calendar.MonthCalendar;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class IncreasedHour extends WorkedHour {
    private String type;
    public IncreasedHour(String nom, float tauxHoraire, String type) {
        super(nom, tauxHoraire);
        this.type = type;
    }
}
