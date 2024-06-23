package org.entreprise.calendar;

import lombok.*;

import javax.crypto.spec.PSource;
import java.text.SimpleDateFormat;
import java.util.*;

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

    public List<String> getAllDays(Calendar startDate){
        List<Calendar> workingDays = new ArrayList<>();
        List<String> workingDaysFormatted = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.ENGLISH);
        Calendar currentDate = (Calendar) startDate.clone();
        for(int i=1; i<=30; i++){
            workingDays.add((Calendar) currentDate.clone());
            currentDate.add(Calendar.DAY_OF_YEAR, 1);
        }
        for(Calendar day : workingDays){
            workingDaysFormatted.add(dateFormat.format(day.getTime()));
        }
        return workingDaysFormatted;
    }

    public static void main(String[] args) {
        var monthCalendar = new MonthCalendar();
        Calendar startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 1);
        System.out.println(monthCalendar.getAllDays(startDate));
    }
}
