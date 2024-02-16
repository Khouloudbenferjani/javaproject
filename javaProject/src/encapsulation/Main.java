package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		// Encapsulation = 	attributes of a class will be hidden or private, 
		//					Can be accessed only through methods (getters & setters)
		//					You should make attributes private if you don't have a reason to make them public/protected
		
		//----> MAKE SOME CHANGES IN ONE OR ALL PARAMETERS 
		
		Car car = new Car("Chevrolet","Camaro",2021);
		
		car.setYear(2022); // to make modification in one of the result of get method--> so we have to add the several get related to each parameter
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}