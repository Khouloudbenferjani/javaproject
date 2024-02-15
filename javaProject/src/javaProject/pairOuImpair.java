package javaProject;

import java.util.Scanner;

public class pairOuImpair {

public static void main(String[] args) {
		
		//récupération de la saisie clavier à l'aide de la classe Scanner
		Scanner sc=new Scanner(System.in);
		
		//affichage à l'écran d'un message demandant à l'utilisateur de taper un nombre	
		System.out.println("Veuillez saisir un nombre :");
		int x=sc.nextInt();
		
		//comparaison du reste r : (on peut déclarer la formule dur reste avant et comparer selon la valeur de r)
				if(x%2==0){
		System.out.println("Le nombre est pair ");
				}
			else{ 
					
		System.out.println("Le nombre est impair ");		
				}
				sc.close() ; 
			
		
				}
}