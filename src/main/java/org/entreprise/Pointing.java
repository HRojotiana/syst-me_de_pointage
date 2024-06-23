package org.entreprise;

import lombok.*;
import org.entreprise.calendar.MonthCalendar;
import org.entreprise.employee.Employee;
import org.entreprise.workedHours.ExtraHour;
import org.entreprise.workedHours.IncreasedHour;
import org.entreprise.workedHours.Leave;
import org.entreprise.workedHours.NightShift;

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
    private List<IncreasedHour> increasedHours; // the employee may have different types of increased hours in a month
    private NightShift nightShift;
    private Leave leave;

    public Pointing(Employee employee, MonthCalendar monthCalendar, NightShift nightShift, Leave leave) {
        this.employee = employee;
        this.monthCalendar = monthCalendar;
        this.extraHours = new ArrayList<>();
        this.increasedHours = new ArrayList<>();
        this.nightShift = nightShift;
        this.leave = leave;
    }

    private int countAllExtraHours(){
        int sumOfAllExtraHours = 0;
        for(ExtraHour extraHour : extraHours){
            sumOfAllExtraHours += extraHour.getValue();
        }
        return sumOfAllExtraHours;
    }

    private int countAllIncreasedHours(Calendar startDate){
        int sumOfAllIncreasedHours = 0;
        for(IncreasedHour increasedHour : increasedHours){
                sumOfAllIncreasedHours += increasedHour.getValue();
        }
        return sumOfAllIncreasedHours;
    }

    public int countAllWorkingHours(Calendar startDate){
        List<Integer> allWorkingHours = new ArrayList<>();
        int allExtraHours = countAllExtraHours();
        int allIncreasedHours = countAllIncreasedHours(startDate);

        int normalWorkHourValue = 8;
        int normalWorkingHours = monthCalendar.getAllDays(startDate).size() * normalWorkHourValue;
        int nightWorkingHours = monthCalendar.getAllDays(startDate).size() * nightShift.getValue();

        if(nightShift.getValue() == 0){
            Collections.addAll(allWorkingHours,allExtraHours, allIncreasedHours, normalWorkingHours, nightWorkingHours, leave.numberOfLeavesDays() * 8);
        }else{
            Collections.addAll(allWorkingHours,allExtraHours, allIncreasedHours, nightWorkingHours, leave.numberOfLeavesDays() * 10);
        }

        int sumOfAllHours = allWorkingHours.stream().reduce(0, (a, b) -> a + b);

        return sumOfAllHours;
    }
}
