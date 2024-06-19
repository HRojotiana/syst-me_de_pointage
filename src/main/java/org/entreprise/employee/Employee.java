package org.entreprise.employee;

import lombok.*;
import org.entreprise.categories.Categorie;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee {
    private String firstName;
    private String lastName;
    private Long serialNumber;
    private LocalDate dateDeNaissance;
    private LocalDate hiringDate;
    private LocalDate contractEndDate;
    private Categorie categorie;
}