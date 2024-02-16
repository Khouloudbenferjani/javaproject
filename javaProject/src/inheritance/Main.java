package inheritance;

public class Main {

	public static void main(String[] args) {
		
		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		
		Car car = new Car();
		
		car.go();
		
		Bicycle bike = new Bicycle();
		
		//car.go();
		bike.stop();
		
		
		// IN ORDER TO CALLS THE FUNCTIONS USED FOR EACH CLASS
		System.out.println(car.wheels);
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		System.out.println(bike.wheels);
		
	}
}