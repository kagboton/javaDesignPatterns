package v1;

import java.util.Random;

public class EtatAPiece implements Etat {

    Random hasard = new Random(System.currentTimeMillis());
    Distributeur distributeur;

    public EtatAPiece(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    @Override
    public void insererPiece() {
        System.out.println("Vous ne pouvez pas insérer d'autres pièces");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Pièce retournée");
        distributeur.setEtatCourant(distributeur.getEtatSansPiece());
    }

    @Override
    public void tournerPoignee() {
        System.out.println("Poignée tournée ..");
        int gagnant = hasard.nextInt(10);
        if ((gagnant == 0) && (distributeur.getNombre() > 1)) {
            distributeur.setEtatCourant(distributeur.getEtatGagnant());
        } else {
            distributeur.setEtatCourant(distributeur.getEtatVendu());
        }}

    @Override
    public void deliver() {

        System.out.println("Pas de bonbon délivré");


    }


}
