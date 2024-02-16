package statickeyword;

public class Friend {


	String name;
	
	static int numberOfFriends;// method to calculate number 
	
	// CONSTERUCTOR TO call the method
	Friend(String name){
		this.name=name;
		numberOfFriends++;
	}	
}