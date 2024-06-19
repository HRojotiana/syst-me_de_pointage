package org.entreprise.catégories;

import org.entreprise.Salaire;

public final class Normal extends Catégorie {
    public Normal(String nom, int nombreDHeuresNormalesDeTravail, Salaire salaireNormal, double indemnité) {
        super(nom, nombreDHeuresNormalesDeTravail, salaireNormal, indemnité);
    }
}
