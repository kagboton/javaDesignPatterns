package simpleFabrique;

public class MiniSimulateur {
    public static  void main(String args[]){

        SimpleFabriqueDePizzas fabriqueDePizzas = new SimpleFabriqueDePizzas();
        Pizzeria pizzeria = new Pizzeria(fabriqueDePizzas);
        pizzeria.commanderPizza("fromage");

    }
}
