package Exercice1;

public class MyPoint {

	private int x =0;
	private int y =0;
	
	//Constructeurs
	
	
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public MyPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Getters et setters
	

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	//Une méthode getXY()qui renvoie x et y dans un tableau int à 2 éléments.
	
	public int[] getXY() {
		int[] tab= {x,y};
		return tab;
		
	}
	
	//Une toString()méthode qui renvoie une description de chaîne de l'instance au format "(x, y)".
	
	public String toString(){
		
		return "le coupe de coordonnés est "+ getXY();
		
	} 
	
	
	//Une méthode appelée distance(int x, int y)qui renvoie la distance de ce point à un autre point aux coordonnées (x, y) données
	
	
	public double distance(int x, int y) {
		double dis=Math.sqrt(Math.pow(getX()-x,2)+Math.pow(getY()-y,2))  ;
		return dis;	
		
	};
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPoint p1 = new MyPoint(3, 4);
	
		System.out.println(p1.getY());
		System.out.println("la distance est :"+ p1.distance(5, 6));

	}



}
