package TD4;

import java.util.Scanner;

public class Exercice3_Q1_TableMultiplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int nbUser = 0, result = 0;

		System.out.print("Saisissez l'entier de la table : ");
		nbUser = sc.nextInt();

		System.out.println("Table de multiplication de "+nbUser);
		for (int i=1;i<=9;i++) {
			result = i*nbUser;
			System.out.println(i+" x "+nbUser+" = "+result);
		}
		sc.close();
	}
}

