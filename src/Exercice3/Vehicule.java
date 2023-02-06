package Exercice3;

public class Vehicule {
	
	//Attribue
	
	public String model;
	public Double speed;
	
	//Constructeurs
	public Vehicule(String model, Double speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Getters et setters
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}


	

}
