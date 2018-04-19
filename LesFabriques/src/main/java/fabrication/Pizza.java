package fabrication;

import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.Fromage;
import fabrication.fabriqueAbstraiteIngredients.ingredients.legumes.Legume;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.Moule;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.Pate;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.Poivron;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceTomate;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

     String nom;
     Pate pate;
     SauceTomate sauce;
     Fromage fromage;
     Legume legume[];
     Poivron poivron;
     Moule moule;



    abstract void preparer();

    void cuire(){
        System.out.println("Cuisson 25 minutes à 180°");
    }
    void couper(){
        System.out.println("Découpage en parts triangulaires");
    }

    void emballer(){
        System.out.println("Emballage dans une boîte officielle");
    }

    public String getNom() {
        return nom;
    }
}
