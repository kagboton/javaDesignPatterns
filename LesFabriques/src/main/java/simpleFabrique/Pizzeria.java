package simpleFabrique;

public class Pizzeria {
    SimpleFabriqueDePizzas fabriqueDePizzas;

    public Pizzeria(SimpleFabriqueDePizzas fabriqueDePizzas) {
        this.fabriqueDePizzas = fabriqueDePizzas;
    }

    public Pizza commanderPizza(String type){
        Pizza pizza;

        pizza = fabriqueDePizzas.creerPizza(type);

        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();

        return pizza;
    }
}
