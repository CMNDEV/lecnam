package TD3;

import java.util.Scanner;

public class Exercice4_Question2_RectangleCreux {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int longueur;
		System.out.println("Combien de lignes d'étoiles souhaitez-vous ?");
		longueur = sc.nextInt();
		for (int i=0; i<longueur; i++) {
			if(i==0 || i==longueur-1) System.out.println("*****");
			else System.out.println("*   *");
		} 
		sc.close();
	}
}





