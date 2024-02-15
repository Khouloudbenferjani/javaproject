package oop;

public class Main {

	public static void main(String[] args) {
		
		Car myCar1 = new Car(); // en jaune nom variable 
		Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model); //affiche les mêmes valeurs mentionnées dans la class o peut choisir n'importe quelle instruction 

		myCar1.drive();
		myCar1.brake();
	}
}