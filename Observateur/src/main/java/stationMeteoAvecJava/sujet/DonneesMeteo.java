package stationMeteoAvecJava.sujet;

import java.util.Observable;

@Deprecated(since = "9")
public class DonneesMeteo  extends Observable{

    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo() {

    }

    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        actualiserMesures();
    }

    public void actualiserMesures(){
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pression;
    }
}
