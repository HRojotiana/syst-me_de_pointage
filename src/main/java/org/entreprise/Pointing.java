package org.entreprise;

import lombok.*;
import org.entreprise.calendar.MonthCalendar;
import org.entreprise.categories.Normal;
import org.entreprise.employee.Employee;
import org.entreprise.workedHours.ExtraHour;
import org.entreprise.workedHours.IncreasedHour;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Pointing {
    private Employee employee;
    private MonthCalendar monthCalendar;
    private ExtraHour extraHour;
    private IncreasedHour increasedHour;

    public int countAllWorkingHours(Calendar startDate){
        List<Integer> allWorkingHours = new ArrayList<>();

        int extraHours = extraHour.getValue();
        int increasedHours = increasedHour.getValue();

        int normalWorkHourValue = 8;
        int normalWorkingHours = employee.getCategory().getListOfWorkingDays(startDate).size() * normalWorkHourValue;

        Collections.addAll(allWorkingHours, extraHours, increasedHours, normalWorkingHours);

        int sumOfAllHours = allWorkingHours.stream().reduce(0, (firstHour, secondHour) -> firstHour + secondHour);

        return sumOfAllHours;
    }
}
