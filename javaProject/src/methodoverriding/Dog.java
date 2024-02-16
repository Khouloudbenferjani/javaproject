package methodoverriding;

public class Dog extends Animal {
	
	
	@Override 
	// WHEN THE SAME METHOD USED IN THE CLASS AND SOUS CLASS
void speak() {
		
		System.out.println("the dog goes *bark*");
	}

}
