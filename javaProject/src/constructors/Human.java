package constructors;

public class Human {

	String name;
	int age;
	double weight;
	
	
	//-------the Constructors-------
	Human(String name,int age,double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	//----------the methods --------
	void eat() {
		System.out.println(this.name+" that weight is :" + this.weight + " is eating"); // afficher plus d'un paramètre  
		System.out.printf("%s that weight is : %f is eating", this.name,this.weight); //si on veut remplir la phrase avec le paramètre qui lui convient 
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}