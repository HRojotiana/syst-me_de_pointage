package org.entreprise.categories;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.Salary;

import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public final class Guardian extends Category {
    public Guardian(String name, int numberOfNormalWorkHours, Salary normalSalary, double compensation) {
        super(name, numberOfNormalWorkHours, normalSalary, compensation);
    }

    /**
     *
     * @param startDate
     * @return
     */
    @Override
    public List<String> getListOfWorkingDays(Calendar startDate) {
        List<Calendar> workingDays = new ArrayList<>();
        List<String> workingDaysFormatted = new ArrayList<>();
        Set<String> holidays = publicHolidaysDates();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.ENGLISH);
        Calendar currentDate = (Calendar) startDate.clone();
        for(int i=1; i<=7; i++){
            if((!holidays.contains(dateFormat.format(currentDate.getTime())))){
                workingDays.add((Calendar) currentDate.clone());
            }
            currentDate.add(Calendar.DAY_OF_YEAR, 1);
        }
        for(Calendar day : workingDays){
            workingDaysFormatted.add(dateFormat.format(day.getTime()));
        }
        return workingDaysFormatted;
    }
}
