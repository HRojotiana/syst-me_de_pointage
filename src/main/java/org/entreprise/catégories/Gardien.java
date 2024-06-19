package org.entreprise.catégories;

import org.entreprise.Salaire;

public final class Gardien extends Catégorie {
    public Gardien(String nom, int nombreDHeuresNormalesDeTravail, Salaire salaireNormal, double indemnité) {
        super(nom, nombreDHeuresNormalesDeTravail, salaireNormal, indemnité);
    }
}
