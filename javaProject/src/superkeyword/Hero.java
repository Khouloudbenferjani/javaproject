package superkeyword;

public class Hero extends Person{
 //sous class cad on prend les anciens parametres de person et ajouter des nouveaux parametres dans ce cas (+power)

	String power;
	
	Hero(String name,int age,String power){	
		super(name,age); // rappeler des parametres pris 
		this.power = power;
	}
	
   public String toString() { // to string lié à return 
   return super.toString()+this.power; // si on met les 2 derniers lignes en comment l'affichage sera liée du return class person
	}
}