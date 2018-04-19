package run;

import commandes.CommandePorteGarage;
import recepteurs.Lampe;
import invocateur.TelecommandeSimple;
import commandes.CommandeAllumerLampe;
import recepteurs.PorteGarage;

public class TestTelecommande {
    public static void main(String[] args) {
        TelecommandeSimple telecommande = new TelecommandeSimple();
        Lampe lampe =  new Lampe();
        PorteGarage porteGarage = new PorteGarage();
        CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
        CommandePorteGarage porteOuverte = new CommandePorteGarage(porteGarage);

        telecommande.setCommande(lampeAllumee);
        telecommande.presseBouton();
        telecommande.setCommande(porteOuverte);
        telecommande.presseBouton();
    }
}
