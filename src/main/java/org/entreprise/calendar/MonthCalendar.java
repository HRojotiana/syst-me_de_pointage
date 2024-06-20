package org.entreprise.calendar;

import lombok.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static java.util.Calendar.JUNE;
import static java.util.Calendar.SUNDAY;
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
