package v1;

public class Distributeur {

    private Etat etatEpuise ;
    private Etat etatSansPiece ;
    private Etat etatGagnant ;
    private Etat etatAPiece ;
    private Etat etatVendu ;


    private Etat etatCourant = etatEpuise;

    int  nombre = 0;

    public Distributeur(int nombre) {
        etatEpuise = new EtatEpuise(this);
        etatAPiece = new EtatAPiece(this);
        etatGagnant = new EtatGagnant(this);
        etatSansPiece = new EtatSansPiece(this);
        etatVendu = new EtatVendu(this);
        this.nombre = nombre;
        if (nombre > 0){
            etatCourant = etatSansPiece;
        }
    }

    public Etat getEtatEpuise() {
        return etatEpuise;
    }

    public void setEtatEpuise(Etat etatEpuise) {
        this.etatEpuise = etatEpuise;
    }

    public Etat getEtatVendu() {
        return etatVendu;
    }

    public void setEtatVendu(Etat etatVendu) {
        this.etatVendu = etatVendu;
    }

    public Etat getEtatSansPiece() {
        return etatSansPiece;
    }

    public void setEtatSansPiece(Etat etatSansPiece) {
        this.etatSansPiece = etatSansPiece;
    }

    public Etat getEtatGagnant() {
        return etatGagnant;
    }

    public void setEtatGagnant(Etat etatGagnant) {
        this.etatGagnant = etatGagnant;
    }

    public Etat getEtatAPiece() {
        return etatAPiece;
    }

    public void setEtatAPiece(Etat etatAPiece) {
        this.etatAPiece = etatAPiece;
    }

    public Etat getEtatCourant() {
        return etatCourant;
    }

    public void setEtatCourant(Etat etatCourant) {
        this.etatCourant = etatCourant;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }


    public void insererPiece(){
        etatCourant.insererPiece();
    }

    public void tournerPoignee(){
        etatCourant.tournerPoignee();
        if(etatCourant instanceof EtatVendu){
            etatCourant.deliver();
        }

    }

    public void deliver(){
        if(etatCourant instanceof EtatVendu)
            etatCourant.deliver();
    }

    public void ejecterPiece(){
        etatCourant.ejecterPiece();
    }

    void liberer(){
        System.out.println("Un bonbon va sortir");
        if (nombre != 0){
            nombre = nombre - 1 ;
        }
    }

    void remplir(int nombre){
        this.nombre = nombre;
        etatCourant = etatSansPiece;
    }

    @Override
    public String toString() {
        return "Distributeur{" +
                "etatCourant=" + etatCourant +
                ", nombre=" + nombre +
                '}';
    }
}
