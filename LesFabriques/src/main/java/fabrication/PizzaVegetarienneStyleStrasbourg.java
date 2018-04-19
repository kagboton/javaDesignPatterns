package fabrication;

public class PizzaVegetarienneStyleStrasbourg  extends Pizza{
    public PizzaVegetarienneStyleStrasbourg() {
        nom = "Pizza végétarienne style Strasbourg";
        sauce =  "Sauce végétarienne";
        pate = "Pâte épaisse";
        // garnitures.add("Parmigiano reggiano râpé");
    }

    @Override
    void couper() {
        System.out.println("Découpage en parts carrées");
    }

}
