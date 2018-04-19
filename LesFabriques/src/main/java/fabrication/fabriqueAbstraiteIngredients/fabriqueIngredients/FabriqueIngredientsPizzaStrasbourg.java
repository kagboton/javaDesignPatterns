package fabrication.fabriqueAbstraiteIngredients.fabriqueIngredients;

import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.Fromage;
import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.Mozzarella;
import fabrication.fabriqueAbstraiteIngredients.ingredients.legumes.*;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.Moule;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.MoulesSurgelees;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.Pate;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.PateSoufflee;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.Poivron;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.PoivronEnRondelle;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceTomate;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceTomatesCerise;

public class FabriqueIngredientsPizzaStrasbourg implements FabriqueIngredientsPizza {
    @Override
    public Pate creerPate() {
        return new PateSoufflee();
    }

    @Override
    public SauceTomate creerSauceTomate() {
        return new  SauceTomatesCerise();
    }

    @Override
    public Fromage creerFromage() {
        return new Mozzarella();
    }

    @Override
    public Legume[] creerLegumes() {
        return new Legume[]{new Aubergine(), new OlivesNoirs(), new Oignon(), new Epinards()};
    }

    @Override
    public Poivron creerPoivron() {
        return new PoivronEnRondelle();
    }

    @Override
    public Moule creerMoule() {
        return new MoulesSurgelees();
    }
}
