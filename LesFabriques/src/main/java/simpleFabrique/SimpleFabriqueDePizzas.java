package simpleFabrique;

public class SimpleFabriqueDePizzas {

    Pizza pizza = null;

    public Pizza creerPizza(String type){

        if (type.equals("fromage")) {
            pizza = new PizzaFromage();
        } else if (type.equals("poivrons")) {
            pizza = new PizzaPoivrons();
        } else if (type.equals("moules")) {
            pizza = new PizzaFruitsDeMer();
        } else if (type.equals("vegetarienne")) {
            pizza = new PizzaVegetarienne();
        }

        return pizza;
    }

}
