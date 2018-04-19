package starbuzzCoffee.application;

import starbuzzCoffee.composants.Boisson;
import starbuzzCoffee.composants.Colombia;
import starbuzzCoffee.composants.Expresso;
import starbuzzCoffee.composants.Sumatra;
import starbuzzCoffee.decorateurs.Caramel;
import starbuzzCoffee.decorateurs.Chantilly;
import starbuzzCoffee.decorateurs.Chocolat;
import starbuzzCoffee.utils.Taille;

import static starbuzzCoffee.utils.Taille.GRAND;

public class StarbuzzCoffee {
    public static void main(String args[]){

        Boisson boisson = new Expresso(Taille.PETIT);
        System.out.println(boisson.getDescription() +" "+ boisson.cout()+ "€" );

        Boisson boisson1 = new Expresso(Taille.MOYEN);
        System.out.println(boisson1.getDescription() +" "+ boisson1.cout()+ "€" );

        Boisson boisson2 = new Sumatra(GRAND);
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chantilly(boisson2);
        System.out.println(boisson2.getDescription() + " "+ boisson2.cout() + "€");

        Boisson boisson3 = new Chantilly(new Chocolat(new Caramel(new Colombia(GRAND))));
        System.out.println(boisson3.getDescription()  +" "+ boisson3.cout()+ "€");

    }
}
