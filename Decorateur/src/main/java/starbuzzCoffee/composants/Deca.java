package starbuzzCoffee.composants;

import starbuzzCoffee.utils.Taille;

public class Deca extends Boisson {

    public Deca(Taille taille) {
        this.taille = taille;
        description = "Deca";
    }

    public double cout() {
        return 1.05;
    }
}
