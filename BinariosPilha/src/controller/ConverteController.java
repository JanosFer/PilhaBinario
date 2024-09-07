package controller;

import br.com.jonas.estruturas.PilhaInt;

public class ConverteController {
	
	PilhaInt p = new PilhaInt();
	
	public String decToBin(int decimal) {
		String binario = "";
		
		while(decimal != 1) {
			p.push(decimal % 2);
			decimal /= 2;
		}
		if(decimal == 1){
			p.push(1);
		}
		
		while(!p.isEmpty()) {
			try {
				binario += p.pop();
			} catch (Exception e) {
				e.getMessage();
			}
		}
		
		return binario;
	}
}
