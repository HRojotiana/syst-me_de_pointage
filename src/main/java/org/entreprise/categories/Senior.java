package org.entreprise.categories;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.Salary;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public final class Senior extends Categorie {
    public Senior(String name, int numberOfNormalWorkHours, Salary normalSalary, double compensation) {
        super(name, numberOfNormalWorkHours, normalSalary, compensation);
    }
}
