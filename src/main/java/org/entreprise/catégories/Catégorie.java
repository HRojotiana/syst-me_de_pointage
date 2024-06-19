package org.entreprise.catégories;

import lombok.*;
import org.entreprise.Salaire;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public sealed class Catégorie permits CadreSupérieur, Normal, Gardien, Chauffeur {
    private final String nom;
    private final int nombreDHeuresNormalesDeTravail;
    private Salaire salaireNormal;
    private double indemnité;
}
