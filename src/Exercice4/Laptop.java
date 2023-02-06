package Exercice4;

public class Laptop extends Computer {

    //les proprietes
    private int batteryLife;

    //le constructeur
    public Laptop(String brand, int stockage, int batteryLife, String modele) {
        super(brand, modele, stockage);
        this.batteryLife = batteryLife;
    }

    public void displaySpecs() {
 
        System.out.println("Battery life: " + batteryLife + " hours");
    }

    public void useTouchpad(String action) {
        System.out.println("Using touchpad to " + action);
    }
}
