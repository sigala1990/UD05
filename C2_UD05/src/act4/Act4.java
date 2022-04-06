package act4;

import java.util.Scanner;

public class Act4 {
	public static void main(String[] args) {
		
		//Variables
		final double PI = Math.PI;  
		Scanner sc = new Scanner(System.in);
		String scValue;
		boolean isDigit = false;
		
		do {//pedir por syso un valor
			System.out.println("Introduce un valor: ");
			scValue = sc.nextLine();
			isDigit = scanValueNotIsString(scValue);
			if(!isDigit) {System.out.println("No has introducido un numero valido.");}//Indica si se introdujo mal el codigo
		}while(isDigit == false);
		sc.close();
		
		double totalvalue = PI * (Math.pow(Double.valueOf(scValue), 2)); //asignar el valor final a totalvalue
		System.out.println("La area del circulo es: "+ String.format("%.2f",totalvalue) + " cm"); 
	}
		
	public static boolean scanValueNotIsString(String text) {//comprueba si el valor pasado por el scanner es float o integer
		int count = 0; 
		for (int i = 0; i < text.length(); i++) {
			char caracter = text.charAt(i);
			if(!Character.isDigit(caracter)) {
				
				if(caracter == 46) {count ++;} //contador de "."
				
				if(caracter != 46 || count > 1) { //verifica si character es otro que no sea "." y si hay mas de un "."
					return false;	
				}	
			}
		}
		return true;
	}
	
}
