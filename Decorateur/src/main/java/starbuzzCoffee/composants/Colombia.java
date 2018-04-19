package starbuzzCoffee.composants;

import starbuzzCoffee.utils.Taille;

public class Colombia extends Boisson {

    public Colombia(Taille taille) {
        this.taille = taille;
        description = "Colombia";
    }

    public double cout() {
        return 0.89;
    }
}
