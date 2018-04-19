package starbuzzCoffee.composants;

import starbuzzCoffee.utils.Taille;

public abstract class Boisson {
    protected  Taille taille;
    protected String description = "Boisson inconnue";

    public String getDescription() {
        return description;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public abstract double cout();
}
