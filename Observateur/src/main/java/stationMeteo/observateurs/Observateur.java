package stationMeteo.observateurs;

public interface Observateur {
    void actualiser(float temp, float humidite, float presssion);
    void afficher();
}
