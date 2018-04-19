package fabrication;

import simpleFabrique.Type;

public class MiniSimulateur {
    public static void main(String args[]){

        Pizza pizzaLuc, pizzaMichel;

        Pizzeria pizzeriaBrest = new PizzeriaBrest();
        Pizzeria pizzeriaStrasbourg = new PizzeriaStrasbourg();

        pizzaLuc = pizzeriaBrest.commanderPizza(Type.FROMAGE);
        System.out.println("Luc a commandé une " + pizzaLuc.getNom() + "\n");

        pizzaMichel = pizzeriaStrasbourg.commanderPizza(Type.VEGETARIENNE);
        System.out.println("Michel a commandé une " + pizzaMichel.getNom() + "\n");

    }
}
