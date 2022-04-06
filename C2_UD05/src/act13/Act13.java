package act13;

import java.util.Scanner;

public class Act13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer operando: ");
		int value1 = sc.nextInt();
		
		System.out.println("Introduce el segundo operando: ");
		int value2 = sc.nextInt();
		
		System.out.println("Introduce el signo aritmético");
		String signo = sc.next();
		sc.close();
		int total = 0;
		double totaldecimal = 0;
		boolean decimal = false;
		
		switch (signo) { // verifica si signo coincide con cualquiera de los casos
			case "+":
				total = value1 + value2; 
				break;
			case "-":
				total = value1 - value2;
				break;
			case "*":
				total = value1 * value2;
				break;
			case "/":
				totaldecimal = (double)value1 / (double)value2; // pasamos todo a double
				decimal = true;
				break;
			case "^":
				total = (int) Math.pow(value1, value2);
				break;
			case "%":
				total = value1 % value2;
				break;			
		}
			if(decimal) {
				System.out.println("El resultado final es " + totaldecimal );	
			}else {
				System.out.println("El resultado final es " + total );	
			}
		
	}

}
