package marreAuxCanards.canards;

import marreAuxCanards.comportements.cancan.ComportementCancan;
import marreAuxCanards.comportements.vol.ComportementVol;

public abstract class Canard {

    ComportementCancan comportementCancan;
    ComportementVol comportementVol;

    public abstract void afficher();

    public void nager() {
        System.out.println("Je nage !");
    }


    public void effectuerCancan(){
        comportementCancan.cancaner();
    }

    public void effectuerVol(){
        comportementVol.voler();
    }

    public void setComportementCancan(ComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    public void setComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }
}
