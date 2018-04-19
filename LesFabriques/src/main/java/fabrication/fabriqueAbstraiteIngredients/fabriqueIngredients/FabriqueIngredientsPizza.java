package fabrication.fabriqueAbstraiteIngredients.fabriqueIngredients;

import fabrication.fabriqueAbstraiteIngredients.ingredients.fromages.Fromage;
import fabrication.fabriqueAbstraiteIngredients.ingredients.legumes.Legume;
import fabrication.fabriqueAbstraiteIngredients.ingredients.moules.Moule;
import fabrication.fabriqueAbstraiteIngredients.ingredients.pates.Pate;
import fabrication.fabriqueAbstraiteIngredients.ingredients.poivrons.Poivron;
import fabrication.fabriqueAbstraiteIngredients.ingredients.saucesTomate.SauceTomate;

public interface FabriqueIngredientsPizza {

    public Pate creerPate();
    public SauceTomate  creerSauceTomate();
    public Fromage creerFromage();
    public Legume [] creerLegumes();
    public Poivron creerPoivron();
    public Moule creerMoule();

}
