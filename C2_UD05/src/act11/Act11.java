package act11;

import java.util.Scanner;

public class Act11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean control = false;
		String text = "";
		
		do { //pedir almenos una vez el dia de semana
			System.out.println("Introduce un dia de la semana"); 
			String dia = sc.nextLine();
			
			switch (dia.toUpperCase()) { //lo ponemos a mayus para que entren en conflicto con las mayus o minus
				case "LUNES":
					text = "NO";
					control = false;
					break;
				case "MARTES":
					text = "NO";
					control = false;
					break;
				case "MIERCOLES":
					text = "NO";
					control = false;
					break;		
				case "JUEVES":
					text = "NO";
					control = false;
					break;		
				case "VIERNES":
					text = "NO";
					control = false;
					break;
				case "SABADO":
					text = "SÍ";
					control = false;
					break;
				case "DOMINGO":
					text = "SÍ";
					control = false;
					break;
				default: //el caso de si introducen otra cosa
					control = true;
					System.out.println("No es un día de la semana");
					break;
			}
		}while(control);
		System.out.println("El día introducido "+ text + " es día laboral" );
		
		sc.close();
	}

}
