package fabrication;

import simpleFabrique.Type;

public abstract class Pizzeria {

    //Méthode de fabrication - Elle sera implémentée dans les sous-classes
    protected abstract Pizza creerPizza(Type type);

    Pizza commanderPizza(Type type){
        Pizza pizza;

        pizza = creerPizza(type);

        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();

        return pizza;


    }

}
