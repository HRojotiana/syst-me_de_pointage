package org.entreprise.categories;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.entreprise.Salary;
@Getter
@Setter
@EqualsAndHashCode
@ToString
public final class Guardian extends Categorie {
    public Guardian(String name, int numberOfNormalWorkHours, Salary normalSalary, double compensation) {
        super(name, numberOfNormalWorkHours, normalSalary, compensation);
    }
}
