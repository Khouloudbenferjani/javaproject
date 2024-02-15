package javaProject;

import java.util.Scanner;

public class maxDeuxNombres {

	public static void main(String[] args) {
		
		//récupération de la saisie clavier à l'aide de la classe Scanner
		Scanner sc=new Scanner(System.in);
		
		//affichage à l'écran d'un message demandant à l'utilisateur de taper le premier nombre	
		System.out.println("Veuillez saisir le premier nombre :");
		float x=sc.nextFloat();
		
		//affichage à l'écran d'un message demandant à l'utilisateur de taper le deuxieme nombre
		System.out.println("Veuillez saisir le 2 ème nombre :");	
		float y=sc.nextFloat();	
		
		//comparaison des deux nombres
				if(x<=y){
		System.out.println("Le maximum des deux nombres "+x+" et "+y+" est égale à  " + y);
				}
			else{ 
					
		System.out.println("Le maximum des deux nombres "+x+" et "+y+" est égale à  " + x);		
				}
				sc.close() ; 
			
		
				}
}