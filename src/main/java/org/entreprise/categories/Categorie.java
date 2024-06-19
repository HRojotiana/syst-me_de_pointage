package org.entreprise.categories;

import lombok.*;
import org.entreprise.Salary;
import org.entreprise.calendar.MonthCalendar;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.List;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.SATURDAY;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public sealed class Categorie permits Senior, Normal, Guardian, Driver {
    private final String name;
    private final int numberOfNormalWorkHours;
    private Salary normalSalary;
    private double compensation;

    public List<LocalDate> getWorkingDays(Calendar calendar, MonthCalendar normalCalendar) {
        if(calendar.DAY_OF_WEEK != SATURDAY){
            return normalCalendar.getListOfWorkingDays();
        }
        return null;
    }
}
