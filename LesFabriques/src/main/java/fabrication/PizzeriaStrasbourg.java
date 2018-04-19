package fabrication;

import simpleFabrique.Type;

public class PizzeriaStrasbourg extends Pizzeria {
    protected Pizza creerPizza(Type type) {
        if(type.equals(Type.FROMAGE))
            return new PizzaFromageStyleStrasbourg();
        else if(type.equals(Type.VEGETARIENNE))
            return new PizzaVegetarienneStyleStrasbourg();
        else return null;
    }
}
