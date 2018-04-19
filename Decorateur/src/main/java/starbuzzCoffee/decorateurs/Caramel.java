package starbuzzCoffee.decorateurs;

import starbuzzCoffee.composants.Boisson;
import starbuzzCoffee.utils.Taille;

import static starbuzzCoffee.utils.Taille.GRAND;
import static starbuzzCoffee.utils.Taille.MOYEN;
import static starbuzzCoffee.utils.Taille.PETIT;

public class Caramel extends DecorateurIngredient {

    Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    public Taille getTaille() {
        return boisson.getTaille();
    }

    public double cout() {
        double cout = boisson.cout();
        if(getTaille()==PETIT)
            cout+= 0.15;
        else if(getTaille()==MOYEN)
            cout+= 0.20;
        if(getTaille()==GRAND)
            cout+= 0.25;
        return cout;
    }
}
