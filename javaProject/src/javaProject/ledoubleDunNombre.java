package javaProject;

import java.util.Scanner;

public class ledoubleDunNombre {

public static void main(String[] args) {
		
		//récupération de la saisie clavier à l'aide de la classe Scanner
		Scanner sc=new Scanner(System.in);
		
		//affichage à l'écran d'un message demandant à l'utilisateur de taper un nombre	
		System.out.println("Veuillez saisir un nombre :");
		double x=sc.nextDouble();
		
		//calculer le double	
		double y=2*x;
		
		//affichage le double est ...
		   System.out.println("le double de : " + x +" est " + y);	
			
				sc.close() ; 
			
		
				}
}