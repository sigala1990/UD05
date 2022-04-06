package act10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indica cantidad");
		Scanner sc1 = new  Scanner(System.in);
		int v1 = sc1.nextInt();
		int valorproducto = 0;
		
		for (int i = 0; i < v1; i++) {//repetimos las veces que nos indiquen para darle valor a cada producto
			System.out.println("Valor para producto: "+ (i+1) );
			valorproducto = valorproducto + sc1.nextInt();
		}
		System.out.println("El total de los "+ v1 + " productos es "+ valorproducto);
		sc1.close();
		/* ALTERNATIVA CON ARRAYs
		//var
		Scanner sc = new  Scanner(System.in); 
		int valueScan = 0;
		int contadorProductos = 0;
		int total = 0;
		
		System.out.print("Indica cuantos productos quieres: ");
		valueScan = sc.nextInt();
		int[] temp = new int[valueScan];
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Indica el precio del valor "+ i +" : ");
			valueScan = sc.nextInt();
			temp[i] = valueScan;  
		}
		for (int i = 0; i < temp.length; i++) {
			total = total + temp[i];
		}
		System.out.println("Total es: "+ total);
		sc.close();
		*/

		
		
	}

}
