package org.entreprise.categories;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.Salary;

import java.util.Calendar;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Senior extends Category {
    public Senior(String name, int numberOfNormalWorkHours, Salary normalSalary, double compensation) {
        super(name, numberOfNormalWorkHours, normalSalary, compensation);
    }

    @Override
    public List<String> getListOfWorkingDays(Calendar startDate) {
        return null;
    }
}
