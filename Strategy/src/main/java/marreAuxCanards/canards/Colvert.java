package marreAuxCanards.canards;

import marreAuxCanards.comportements.cancan.Cancan;
import marreAuxCanards.comportements.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

    public Colvert() {
        comportementCancan = new Cancan();
        comportementVol = new VolerAvecDesAiles();
    }

    public void afficher() {
        System.out.println("Je suis un colvert");
    }

}
