package org.entreprise.catégories;

import org.entreprise.Salaire;

public final class CadreSupérieur extends Catégorie {

    public CadreSupérieur(String nom, int nombreDHeuresNormalesDeTravail, Salaire salaireNormal, double indemnité) {
        super(nom, nombreDHeuresNormalesDeTravail, salaireNormal, indemnité);
    }
}
