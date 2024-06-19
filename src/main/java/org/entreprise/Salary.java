package org.entreprise;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public class Salary {
    private final double grossSalary;
    private double netSalary;

    public Salary(float grossSalary) {
        this.grossSalary = grossSalary;
        this.netSalary = this.grossSalary - this.grossSalary * 0.2;
    }
}
