package fabrication.fabriqueAbstraiteIngredients.fabriqueIngredients;


import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.Fromage;
import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.FromageDeChevre;
import fabrication.fabriqueAbstraiteIngredients.ingredients.legumes.*;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.Calamars;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.Moule;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.Pate;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.PateTresFine;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.Poivron;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.PoivronEnRondelle;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceBruschetta;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceTomate;

public class FabriqueIngredientsPizzaMarseille implements FabriqueIngredientsPizza {
    @Override
    public Pate creerPate() {
        return new PateTresFine();
    }

    @Override
    public SauceTomate creerSauceTomate() {
        return new SauceBruschetta();
    }

    @Override
    public Fromage creerFromage() {
        return new FromageDeChevre();
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
        return new Calamars();
    }
}
