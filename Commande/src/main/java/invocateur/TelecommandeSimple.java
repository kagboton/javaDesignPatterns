package invocateur;

import commandes.Commade;

public class TelecommandeSimple {

    Commade emplacement;

    public TelecommandeSimple() {
    }

    public void setCommande(Commade commande) {
        this.emplacement = commande;
    }

    public  void presseBouton(){
        emplacement.executer();
    }
}
