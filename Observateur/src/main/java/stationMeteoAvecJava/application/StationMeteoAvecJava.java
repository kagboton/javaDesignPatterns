package stationMeteoAvecJava.application;

import stationMeteoAvecJava.observateurs.AffichageConditions;
import stationMeteoAvecJava.observateurs.AffichagePrevisions;
import stationMeteoAvecJava.sujet.DonneesMeteo;

public class StationMeteoAvecJava {

    public static void main(String args[]){
        DonneesMeteo donneesMeteo = new DonneesMeteo();

        AffichageConditions affichageConditions = new AffichageConditions(donneesMeteo);
        AffichagePrevisions affichagePrevisions = new AffichagePrevisions(donneesMeteo);

        donneesMeteo.setMesures(26, 65, 1020);

        donneesMeteo.actualiserMesures();

    }

}
