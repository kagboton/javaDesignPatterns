package fabrication;

import simpleFabrique.Type;

public class PizzeriaBrest extends Pizzeria {
    protected Pizza creerPizza(Type type) {
        if(type.equals(Type.FROMAGE))
            return new PizzaFromage();
        else if(type.equals(Type.VEGETARIENNE))
            return new PizzaVegetarienneStyleBrest();
        else return null;
    }
}
