package org.entreprise.calendar;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.categories.Category;

import java.util.Calendar;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class WorkingDays extends MonthCalendar{
    private Category category;
    public WorkingDays(Calendar juneCalendar) {
        super(juneCalendar);
    }



}
