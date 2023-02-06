package Exercice4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  
		Laptop laptop = new Laptop("Dell", 8, 500, "nd");
        laptop.displaySpecs();
        laptop.useTouchpad("scrolling");
        
        SmartPhone smartphone = new SmartPhone("Samsung", 4, 128, "Android");
     
        smartphone.makeCall("123456789");

	}

}
