package org.entreprise.employé;

import lombok.*;
import org.entreprise.Salaire;
import org.entreprise.catégories.Catégorie;

import java.time.LocalDate;
import java.util.Date;
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employé {
    private String noms;
    private String prénoms;
    private LocalDate dateDeNaissance;
    private LocalDate dateDEmbauche;
    private LocalDate dateDeFinDeContrat;
    private Catégorie catégorie;
}