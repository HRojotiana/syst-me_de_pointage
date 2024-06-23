package org.entreprise.calendar;

import lombok.*;

import java.util.Calendar;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MonthCalendar {
    private Calendar juneCalendar = Calendar.getInstance();

    public MonthCalendar() {
        this.juneCalendar.set(Calendar.YEAR, 2024);
        this.juneCalendar.set(Calendar.MONTH, 5);
    }
}
