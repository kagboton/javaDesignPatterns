package stationMeteoAvecJava.observateurs;

import stationMeteoAvecJava.sujet.DonneesMeteo;

import java.util.Observable;
import java.util.Observer;

@Deprecated
public class AffichagePrevisions implements Observer, Affichage {

    Observable observable;
    private float pressionActuelle = 1012;
    private float dernierePression;

    public AffichagePrevisions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    public void update(Observable o, Object arg) {
        if(o instanceof DonneesMeteo){
            DonneesMeteo donneesMeteo = (DonneesMeteo)o;
            dernierePression = pressionActuelle;
            pressionActuelle = donneesMeteo.getPression();
        }
        afficher();
    }

    public void afficher(){
        if(pressionActuelle < 1000){
            System.out.println("Prévision : Dépression bien installéei");
        }
        else if(pressionActuelle > 1000 && pressionActuelle < 2000 ){
            System.out.println("Prévision : Le temps se rafraîchit");
        }
        else if(pressionActuelle > 2000){
            System.out.println("Prévision : Amélioration en cours !");
        }

    }
}
