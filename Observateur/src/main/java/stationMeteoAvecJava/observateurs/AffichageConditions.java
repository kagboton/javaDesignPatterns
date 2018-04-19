package stationMeteoAvecJava.observateurs;

import stationMeteoAvecJava.sujet.DonneesMeteo;

import java.util.Observable;
import java.util.Observer;

@Deprecated
public class AffichageConditions implements Observer, Affichage {

    Observable observable;
    private float temperature;
    private float humidite;

    public AffichageConditions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    public void update(Observable o, Object arg) {

        if (o instanceof DonneesMeteo){
            DonneesMeteo donneesMeteo = (DonneesMeteo)o;
            this.temperature = donneesMeteo.getTemperature();
            this.humidite = donneesMeteo.getHumidite();
        }
        afficher();
    }

    public void afficher(){
        System.out.println("Conditions actuelles : " + temperature
                + " degrés C et "  + humidite + " % d’humidité");
    }
}
