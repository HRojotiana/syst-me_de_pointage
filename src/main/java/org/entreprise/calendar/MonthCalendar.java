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
    private Calendar juneCalendar;

    public MonthCalendar(Calendar juneCalendar) {
        if(this.juneCalendar.MONTH == JUNE){
            this.juneCalendar = juneCalendar;
        }
    }

    public List<LocalDate> getListOfWorkingDays(){
        List workingDays = new ArrayList<>();
        if(this.juneCalendar.MONTH == JUNE) {
            while (juneCalendar.DAY_OF_WEEK != SUNDAY) {
                workingDays.add(Calendar.DATE);
            }
        }
        return workingDays;
    }

}
