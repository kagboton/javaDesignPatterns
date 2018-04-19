package commandes;

import recepteurs.PorteGarage;

public class CommandePorteGarage implements Commade {

    PorteGarage porteGarage;

    public CommandePorteGarage(PorteGarage porteGarage) {
        this.porteGarage = porteGarage;
    }

    @Override
    public void executer() {
        porteGarage.ouvrir();
    }
}
