package Exercice3;

public class Car extends Vehicule {
	
	public String carName;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Car(String model, Double speed, String carName) {
		super(model, speed);
		this.carName = carName;
	}


	public Car(String model, Double speed) {
		super(model, speed);
		// TODO Auto-generated constructor stub
	}

	public String getDetails() {
		return carName;
	}

	public void setDetails(String carName) {
		this.carName = carName;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("Roadster", 100.0,"Testla");
		
		System.out.println("le nom du model est : "+c1.getModel()+" Le nom du car est : "+ c1.carName + " La vitesse est :"+c1.getSpeed());
		
		
		

	}
	

}
