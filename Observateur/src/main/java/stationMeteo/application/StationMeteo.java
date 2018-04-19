package stationMeteo.application;

import stationMeteo.observateurs.AffichageConditions;
import stationMeteo.sujet.DonneesMeteo;
import stationMeteo.sujet.Sujet;

public class StationMeteo {

    public static void main(String args[]){

        DonneesMeteo donneesMeteo = new DonneesMeteo();

        AffichageConditions affichageConditions = new AffichageConditions(donneesMeteo);

        donneesMeteo.setMesures(26, 65, 1020);

        donneesMeteo.notifierObservateurs();

    }
}
