package v1;

import v1.Distributeur;


public class TestDistributeur {

    public static  void main(String args[]){

        Distributeur distributeur = new Distributeur(5);

        System.out.println(distributeur);

        distributeur.insererPiece();
        distributeur.tournerPoignee();
        System.out.println(distributeur);

        distributeur.insererPiece();
        distributeur.tournerPoignee();
        System.out.println(distributeur);

        distributeur.insererPiece();
        distributeur.tournerPoignee();
        System.out.println(distributeur);
    }
}
