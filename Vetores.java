package vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		String nome [] = new String [5]; 
		
		for (int i = 0; i<5; i++) {
			System.out.println("Infome o nome: ");
			nome [i] = sc.next();
		}
		for (int i = 0; i<5; i++) {
			System.out.println(nome [i]);
		}
		
		
		sc.close();

	}

}
