package act3;

import javax.swing.JOptionPane;

public class Act3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");//asignamos a nombre el valor introducido por el JOptionPane
		JOptionPane.showMessageDialog(null, "Bienvenido " + nombre); // muestra otro  JOptionPane informativo
			
	}
}
