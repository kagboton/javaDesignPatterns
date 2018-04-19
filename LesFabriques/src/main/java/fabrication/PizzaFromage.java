package fabrication;


import fabrication.fabriqueAbstraiteIngredients.fabriqueIngredients.FabriqueIngredientsPizza;

public class PizzaFromage extends Pizza{

    FabriqueIngredientsPizza fabriqueIngredients;


    public PizzaFromage(FabriqueIngredientsPizza fabriqueIngredients) {

        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    void preparer() {
        sauce = fabriqueIngredients.creerSauceTomate();
        fromage = fabriqueIngredients.creerFromage();
        poivron = fabriqueIngredients.creerPoivron();
    }
}
