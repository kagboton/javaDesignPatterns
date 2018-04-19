package v1;

public class EtatGagnant implements Etat {

    Distributeur distributeur;

    public EtatGagnant(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    @Override
    public void insererPiece() {
        System.out.println("Veuillez patienter, le bonbon va tomber");
    }

    @Override
    public void ejecterPiece() {
        System.out.println("Vous avez déjà tourné la poignée");
    }


    @Override
    public void tournerPoignee() {
        System.out.println("Inutile de tourner deux fois !");
    }

    @Override
    public void deliver() {
        System.out.println("VOUS AVEZ GAGNÉ ! Deux bonbons pour le prix d’un !");
        distributeur.liberer();//donner le 1er bonbon
        if(distributeur.getNombre() == 0){
            distributeur.setEtatCourant(distributeur.getEtatEpuise());
        }else {
            distributeur.liberer();//donner le 2e bobon
            if (distributeur.getNombre() > 0){
                distributeur.setEtatCourant(distributeur.getEtatSansPiece());
            }else {
                System.out.println("Aïe, plus de bonbons !");
                distributeur.setEtatCourant(distributeur.getEtatEpuise());
            }
        }
    }


}
