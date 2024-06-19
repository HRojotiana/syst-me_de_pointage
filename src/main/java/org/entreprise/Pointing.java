package org.entreprise;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.calendar.MonthCalendar;
import org.entreprise.employee.Employee;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Pointing {
    private Employee employee;
    private MonthCalendar monthCalendar;
    private int extraHoursNumber;
    private int increasedHoursNumber;

    public Pointing(Employee employee, MonthCalendar monthCalendar, int extraHoursNumber, int increasedHoursNumber) {
        this.employee = employee;
        this.monthCalendar = monthCalendar;
        this.extraHoursNumber = extraHoursNumber;
        this.increasedHoursNumber = increasedHoursNumber;
    }
}
