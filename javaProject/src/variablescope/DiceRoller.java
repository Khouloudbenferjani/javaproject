package variablescope;

import java.util.Random;

public class DiceRoller {
 
	
	//global out side the method 
 Random random;
 int number; 
   
 
 //-----CONSTRUCTORS-----
 DiceRoller(){
  random = new Random();
  //Random random = new Random ();
  //int number = 0;
  roll();
 }
 
 
//------method 
 void roll() {
  number = random.nextInt(6)+1;
  System.out.println(number);
 }
}