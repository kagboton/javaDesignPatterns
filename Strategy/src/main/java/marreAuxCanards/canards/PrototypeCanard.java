package marreAuxCanards.canards;

import marreAuxCanards.comportements.cancan.CanardMuet;
import marreAuxCanards.comportements.vol.NePasVoler;

public class PrototypeCanard extends Canard {
    public PrototypeCanard() {
        comportementCancan = new CanardMuet();
        comportementVol = new NePasVoler();
    }

    public void afficher() {
        System.out.println("Je suis un prototype de canard");
    }
}
