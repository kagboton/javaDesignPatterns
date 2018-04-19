package starbuzzCoffee.decorateurs;

import starbuzzCoffee.composants.Boisson;

import static starbuzzCoffee.utils.Taille.GRAND;
import static starbuzzCoffee.utils.Taille.MOYEN;
import static starbuzzCoffee.utils.Taille.PETIT;

public class Lait extends DecorateurIngredient {

    Boisson boisson;

    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return boisson.getDescription() + ", Lait";
    }

    public double cout() {
        double cout = boisson.cout();
        if(getTaille()==PETIT)
            cout+= 0.10;
        else if(getTaille()==MOYEN)
            cout+= 0.15;
        if(getTaille()==GRAND)
            cout+= 0.10;
        return cout;
    }
}
