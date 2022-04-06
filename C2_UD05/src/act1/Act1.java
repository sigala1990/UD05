package act1;

public class Act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var
		int valor1 = 5;
		int valor2 = 10;
		
		if(valor1 > valor2) {//checkea si el valor1 es mas grande que el valor2
			System.out.println("El valor "+ valor1 + " es más grande que "+ valor2);
		}else if(valor1 < valor2) { //checkea si valor1 es mas peq que valor2
			System.out.println("El valor "+ valor2 + " es más grande que "+ valor1);
		}else { // mira si son iguales
			System.out.println("Los valores son iguales");
		}
	}

}
