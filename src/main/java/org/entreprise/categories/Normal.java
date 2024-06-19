package org.entreprise.categories;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.Salary;
import org.entreprise.calendar.MonthCalendar;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Normal extends Categorie {
    public Normal(String name, int numberOfNormalWorkHours, Salary normalSalary, double compensation) {
        super(name, numberOfNormalWorkHours, normalSalary, compensation);
    }
}
