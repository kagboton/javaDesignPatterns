package stationMeteo.observateurs;

import stationMeteo.sujet.DonneesMeteo;
import stationMeteo.sujet.Sujet;

public class AffichageConditions implements Observateur {

    private Sujet donneesMeteo;

    private float temperature;
    private float humidite;
   // private float pression;

    public AffichageConditions(Sujet donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        donneesMeteo.enregistrerObservateur(this);
    }

    public void actualiser(float temp, float humidite, float presssion) {
        this.temperature = temp;
        this.humidite = humidite;
        afficher();

    }

    public void afficher(){
        System.out.println("Conditons actuelles: " +
                temperature +" degrés C et " + humidite + " %humidité" );
    }

}
