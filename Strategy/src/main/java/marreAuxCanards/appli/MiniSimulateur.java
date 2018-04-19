package marreAuxCanards.appli;

import marreAuxCanards.canards.Canard;
import marreAuxCanards.canards.Colvert;
import marreAuxCanards.canards.PrototypeCanard;
import marreAuxCanards.comportements.vol.PropulsionAReaction;

public class MiniSimulateur {

    public static void main(String args[]){
        Canard colvert = new Colvert();
        colvert.afficher();
        colvert.effectuerCancan();
        colvert.effectuerVol();

        Canard proto = new PrototypeCanard();
        proto.effectuerVol();
        proto.setComportementVol(new PropulsionAReaction());
        proto.effectuerVol();
    }
}
