package marreAuxCanards.canards;

import marreAuxCanards.comportements.cancan.CoinCoin;
import marreAuxCanards.comportements.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

    public CanardEnPlastique() {
        comportementCancan = new CoinCoin();
        comportementVol = new NePasVoler();
    }

    public void afficher() {
        System.out.println("Je suis un carnard en plastique !");
    }
}
