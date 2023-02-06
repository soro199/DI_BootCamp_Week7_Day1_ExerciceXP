package Exercice4;

public class SmartPhone extends Computer {

    //les proprietes
    private String operatingSystem;

    //le constructeur
    public SmartPhone(String brand, int stockage, int par1, String modele) {
        super(brand, modele, stockage);
        this.operatingSystem = operatingSystem;
    }

    
    public void displaySpecs() {
    
        System.out.println("Operating System: " + operatingSystem);
    }

    public void makeCall(String phoneNumber) {
        String brand = null;
        System.out.println("Calling " + phoneNumber + " using " + brand + " smartphone");
    }
}

	
	
	


