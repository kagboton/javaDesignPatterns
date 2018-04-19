package starbuzzCoffee.decorateurs;

import starbuzzCoffee.composants.Boisson;

import static starbuzzCoffee.utils.Taille.GRAND;
import static starbuzzCoffee.utils.Taille.MOYEN;
import static starbuzzCoffee.utils.Taille.PETIT;

public class Chocolat extends DecorateurIngredient {

    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return boisson.getDescription() + ", Chocolat" ;
    }

    public double cout() {
        double cout = boisson.cout();
        if(getTaille() == PETIT)
            cout+= 0.20;
        else if(getTaille() == MOYEN)
            cout+= 0.25;
        if(getTaille() == GRAND)
            cout+= 0.30;
        return cout;
    }
}
