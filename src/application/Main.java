package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pets;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Pets pets = new Pets();
		
		System.out.println("Racas trabalhadas");
		System.out.println("[1]Bulldog");
		System.out.println("Informe a raca do cachorro");
		pets.raca = sc.nextLine();
		System.out.println("Infome a quantidade de pelos de 1 a 5:");
		pets.pelos = sc.nextInt();
		
		System.out.println(pets.pelosCondition());
		
		
	}
	
}
