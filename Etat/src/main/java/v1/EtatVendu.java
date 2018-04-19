package v1;

public class EtatVendu implements Etat {

    Distributeur distributeur;

    public EtatVendu(Distributeur distributeur) {
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
        distributeur.liberer();
        if (distributeur.getNombre() == 0){
            System.out.println("Aïe, plus de bonbons !");
            distributeur.setEtatCourant(distributeur.getEtatEpuise());
        }else if(distributeur.getNombre() > 0){

            distributeur.setEtatCourant(distributeur.getEtatSansPiece());
        }
    }


}
