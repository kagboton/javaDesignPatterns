package starbuzzCoffee.composants;

import starbuzzCoffee.utils.Taille;

public class Expresso extends Boisson{

    public Expresso(Taille taille) {
        description = "Expresso";
        this.taille = taille;
    }

    public double cout() {
        return 1.99;
    }
}
