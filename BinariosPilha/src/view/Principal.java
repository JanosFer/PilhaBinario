package view;

import java.util.Scanner;

import controller.ConverteController;

public class Principal {
	public static void main(String[] args) {
		ConverteController converter = new ConverteController();
		Scanner ler = new Scanner(System.in);
		
		int decimal = 0;
		
		while(true) {
			System.out.println("Informe um valor inteiro entre 0 e 1000: ");
			decimal = ler.nextInt();
			ler.nextLine();
			if(decimal <= 1000 && decimal > 0) {
				break;
			}
		}
		
		System.out.println(converter.decToBin(decimal));
		
		ler.close();
	}
}
