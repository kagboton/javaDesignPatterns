package v1;

public class EtatSansPiece implements Etat {

    Distributeur distributeur;

    public EtatSansPiece(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    @Override
    public void insererPiece() {
        System.out.println("Vous avez inséré une pièce");
        distributeur.setEtatCourant(distributeur.getEtatAPiece());
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Vous n’avez pas inséré de pièce");
    }

    @Override
    public void tournerPoignee() {
        System.out.println("Vous avez tourné, mais il n’y a pas de pièce");
    }

    @Override
    public void deliver() {
        System.out.println("Il faut payer d’abord");
    }


}
