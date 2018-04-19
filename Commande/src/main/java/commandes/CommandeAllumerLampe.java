package commandes;

import recepteurs.Lampe;

public class CommandeAllumerLampe implements Commade {

    Lampe lampe;

    public CommandeAllumerLampe(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void executer() {
        lampe.marche();
    }
}
