package fabrication.fabriqueAbstraiteIngredients.fabriqueIngredients;

import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.Fromage;
import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.Reggiano;
import fabrication.fabriqueAbstraiteIngredients.ingredients.legumes.*;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.Moule;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.MoulesFraiches;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.Pate;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.PateFine;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.Poivron;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.PoivronEnRondelle;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceMarinara;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceTomate;

public class FabriqueIngredientsPizzaBrest implements FabriqueIngredientsPizza {
    @Override
    public Pate creerPate() {
        return new PateFine();
    }

    @Override
    public SauceTomate creerSauceTomate() {
        return new SauceMarinara();
    }

    @Override
    public Fromage creerFromage() {
        return new Reggiano();
    }

    @Override
    public Legume[] creerLegumes() {
        return new Legume[]{new Ail(), new Champignon(), new Oignon(), new PoivronRouge()};
    }

    @Override
    public Poivron creerPoivron() {
        return new PoivronEnRondelle();
    }

    @Override
    public Moule creerMoule() {
        return new MoulesFraiches();
    }
}
