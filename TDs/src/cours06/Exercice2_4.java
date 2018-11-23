package cours06;

import java.util.Scanner;

public class Exercice2_4 {

	public static void main(String[] args) {
		int [] tab = new int[6];
		int i=0;
		double somme = 0.0, moyenne = 0.0;;
		Scanner sc = new Scanner(System.in);

		// on remplit le tableau 
		for (i=0;i<6;i++)
		{
			System.out.print("Saisissez un entier : ");
			tab[i]=sc.nextInt();
		}

		// On affiche le tableau et on calcule la somme en même temps
		System.out.println("Voici votre tableau : ");
		for (i=0;i<6;i++)
		{
			System.out.print(tab[i]+" | ");
			somme+=tab[i];
		}	

		moyenne = somme/6.; 

		// le point permet de conserver la division classique
		System.out.println("\nLa moyenne de ce tableau est : " + moyenne);
		// Pour clore le Scanner
		sc.close();
	}

}
