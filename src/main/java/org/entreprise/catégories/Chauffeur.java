package org.entreprise.catégories;

import org.entreprise.Salaire;

public final class Chauffeur extends Catégorie {
    public Chauffeur(String nom, int nombreDHeuresNormalesDeTravail, Salaire salaireNormal, double indemnité) {
        super(nom, nombreDHeuresNormalesDeTravail, salaireNormal, indemnité);
    }
}
