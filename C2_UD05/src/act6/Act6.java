package act6;

import java.util.Scanner;

public class Act6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int IVA = 21;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica un precio, por ejemplo 4,4: ");
		
		float scValue = sc.nextFloat(); //coge valor del teclado
		sc.close();
		float  finalValue = scValue + (scValue * IVA /100); // consigue el valorfinal de la operacion
		sc.close();
		
		System.out.println("El valor " + scValue + " + el IVA(21%) = "+ String.format("%.2f",finalValue));//printa el resultado
	}

}
