package javaProject;

import java.util.Scanner;

public class EchangerDeuxNombres {

public static void main(String[] args) {
	 
		//récupération de la saisie clavier à l'aide de la classe Scanner
		Scanner sc=new Scanner(System.in);
		
		//affichage à l'écran d'un message demandant à l'utilisateur de taper le premier nombre	x
		System.out.println("Veuillez saisir la valeur de x :");
		String x=sc.nextLine();
		
		//affichage à l'écran d'un message demandant à l'utilisateur de taper le deuxieme nombre	
		System.out.println("Veuillez saisir la valeur de y :");
		String y=sc.nextLine();
		
		//Décalaration de z
				String z;
		
	    // permutation 
		z=x;
		x=y;
		y=z;
		System.out.println("La valeur de x est : "+x); 
		System.out.println("La valeur de y est : "+y);
				sc.close() ; 
			
		
				}
}