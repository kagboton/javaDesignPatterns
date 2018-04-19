package stationMeteo.sujet;

import stationMeteo.observateurs.Observateur;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Sujet {

    private List<Observateur> observateurs;

    float temperature;
    float humidite;
    float pression;

    public DonneesMeteo() {
        observateurs = new ArrayList<Observateur>();
    }


    public void setMesures(float temperature,float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
    }


    public void enregistrerObservateur(Observateur o) {
        observateurs.add(o);

    }

    public void supprimerObservateur(Observateur o) {
        int i = observateurs.indexOf(o);
        //Vérifions si l'observateur existe
        if( i >= 0){
            observateurs.remove(o);
        }
    }

    public void notifierObservateurs() {
        for (Observateur o : observateurs){
            o.actualiser(temperature, humidite, pression);
        }
    }

    public void actualiseMesures(){
        notifierObservateurs();
    }
}
