package org.entreprise.categories;

import lombok.*;
import org.entreprise.Salary;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public sealed class Categorie permits Senior, Normal, Guardian, Driver {
    private final String name;
    private final int numberOfNormalWorkHours;
    private Salary normalSalary;
    private double compensation;
}
