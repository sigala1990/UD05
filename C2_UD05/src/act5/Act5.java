package act5;

import java.util.Scanner;

public class Act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int value =sc.nextInt(); //coge el valor del scaner
		if(value % 2 == 0) { //residuo es 0
			System.out.println("El módulo es "+value % 2 +", si es divisible");
		}else {//residuo es distinto a 0
			System.out.println("El módulo es "+value % 2 +", no es divisible");
		}
		sc.close();
	}

}
