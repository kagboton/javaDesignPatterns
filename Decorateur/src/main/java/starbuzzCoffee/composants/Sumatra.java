package starbuzzCoffee.composants;

import starbuzzCoffee.utils.Taille;

public class Sumatra extends Boisson {

    public Sumatra(Taille taille) {
        description = "Sumatra";
        this.taille = taille;
    }

    public double cout() {
        //les cout changent en fonction de la taille
        return 0.99;
    }
}
