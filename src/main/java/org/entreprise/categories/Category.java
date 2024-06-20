package org.entreprise.categories;

import lombok.*;
import org.entreprise.Salary;

import java.text.SimpleDateFormat;
import java.util.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public sealed abstract class Category permits Senior, Normal, Guardian, Driver {
    private final String name;
    private final int numberOfNormalWorkHours;
    private Salary normalSalary;
    private double compensation;

    protected Set<String> publicHolidaysDates(){
        Set<String> holidaysDates = new HashSet<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2024, Calendar.JUNE, 17);
        Calendar date2 = Calendar.getInstance();
        date2.set(2024, Calendar.JUNE, 25);
        Calendar date3 = Calendar.getInstance();
        date3.set(2024, Calendar.JUNE, 26);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.ENGLISH);
        Collections.addAll(holidaysDates, dateFormat.format(date1.getTime()), dateFormat.format(date2.getTime()), dateFormat.format(date3.getTime()));
        return holidaysDates;
    }

    public abstract List<String> getListOfWorkingDays(Calendar startDate);
}
