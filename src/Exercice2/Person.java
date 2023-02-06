package Exercice2;

public class Person {

	// Les attributs

	protected String name;
	protected String lastName;
	protected String email;
	protected int age;

	// Constructeurs avec Parametre

	public Person(String name, String lastName, String email, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	// Getters et setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		
		return "mon nom est : "+ getName()+ " ,Mon prenom est : "+ getLastName() + " ,Mon email est : "+ getEmail()+ " ,Mon age est : "+ getAge();
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Person person = new Person("John", "Wick", "john@wick.com", 55);
		System.out.println(person.toString());

	}

}
