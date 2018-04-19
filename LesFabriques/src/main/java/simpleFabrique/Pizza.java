package simpleFabrique;

public abstract class Pizza {

    abstract void preparer();
    public void cuire() {
        System.out.println("Je fais cuire");
    }

    public void couper() {
        System.out.println("Je coupe");
    }

    public void emballer() {
        System.out.println("J'emballe");
    }
}
