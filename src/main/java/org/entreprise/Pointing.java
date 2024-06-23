package org.entreprise;

import lombok.*;
import org.entreprise.calendar.MonthCalendar;
import org.entreprise.categories.Normal;
import org.entreprise.employee.Employee;
import org.entreprise.workedHours.ExtraHour;
import org.entreprise.workedHours.IncreasedHour;

import java.awt.*;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Pointing {
    private Employee employee;
    private MonthCalendar monthCalendar;
    private List<ExtraHour> extraHours; //for example extraHours.get(0) = 8 (the number of hours in a week)
    private List<IncreasedHour> increasedHours = new ArrayList<>(); // the employe may have different types of increased hours in a week

    public Pointing(Employee employee, MonthCalendar monthCalendar) {
        this.employee = employee;
        this.monthCalendar = monthCalendar;
        this.extraHours = new ArrayList<>();
        this.increasedHours = new ArrayList<>();
    }

    private int countAllExtraHours(){
        int sumOfAllExtraHours = 0;
        for(ExtraHour extraHour : extraHours){
            sumOfAllExtraHours += extraHour.getValue();
        }
        return sumOfAllExtraHours;
    }

    private int countAllIncreasedHours(){
        int sumOfAllIncreasedHours = 0;
        for(IncreasedHour increasedHour : increasedHours){
            sumOfAllIncreasedHours += increasedHour.getValue();
        }
        return sumOfAllIncreasedHours;
    }

    public int countAllWorkingHours(Calendar startDate){
        List<Integer> allWorkingHours = new ArrayList<>();
        int allExtraHours = countAllExtraHours();
        int allIncreasedHours = countAllIncreasedHours();

        int normalWorkHourValue = 8;
        int normalWorkingHours = employee.getCategory().getListOfWorkingDays(startDate).size() * normalWorkHourValue;

        Collections.addAll(allWorkingHours,allExtraHours, allIncreasedHours, normalWorkingHours);

        int sumOfAllHours = allWorkingHours.stream().reduce(0, (a, b) -> a + b);

        return sumOfAllHours;
    }
}
