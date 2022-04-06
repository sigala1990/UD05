package act12;

import javax.swing.JOptionPane;

public class Act12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pswd = "1234";
		String inputText = "";
		int limitError = 3;
		boolean limiteSuperado = false;
		for (int i = 0; i < limitError; i++) {//repite las 3 veces
			inputText = JOptionPane.showInputDialog("Introduce la password");
			
			if(!inputText.equals(pswd)) {//mira si el contenido de las variables no son identicas
					if(i == 2) {limiteSuperado = true;} //ultimo intento fracasdo, suelta msgError
			}else {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				limiteSuperado = false;
			}
		}	
		if(limiteSuperado) {//msg de error si falla las 3 veces.
			JOptionPane.showMessageDialog(null, "ERROR 404 \n Revisa tu correo si eres el dueño de esta cuenta sino llama a soporte tecnico al 9771233456");
		}

	}

}
