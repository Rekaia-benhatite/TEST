package TP4;
import java.util.Scanner;
public class exo2 {
	public static void main (String args[]) {
		Scanner e = new Scanner(System.in);
		System.out.println ("donner un verb du premier groupe se terminant par 'er':");
		String verbe = e.nextLine();
		
		 if (!verbe.endsWith("er")) {
	            System.out.println("Le verbe doit se terminer par 'er'.");
	            return;
	        }
		 
		 
		 System.out.println("Conjugaison au présent de l'indicatif :");
	        System.out.println("Je " + verbe.substring(0, verbe.length() - 2) + "e");
	        System.out.println("Tu " + verbe.substring(0, verbe.length() - 2) + "es");
	        System.out.println("Il/Elle " + verbe.substring(0, verbe.length() - 2) + "e");
	        System.out.println("Nous " + verbe.substring(0, verbe.length() - 2) + "ons");
	        System.out.println("Vous " + verbe.substring(0, verbe.length() - 2) + "ez");
	        System.out.println("Ils/Elles " + verbe.substring(0, verbe.length() - 2) + "ent");

	      e.close();

	}

}
