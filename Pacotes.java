
package domain;
import javax.swing.JOptionPane;

import domain.Rectangle;


	public class Pacotes {
		
		private static int showMsg() {
			return JOptionPane.showConfirmDialog(null, "Opção Inválida.");
		}

		private static String getString(String msg) {
			return JOptionPane.showInputDialog(msg);
		}

		private static int getInt(String msg) {
			return Integer.valueOf(JOptionPane.showInputDialog(msg));
		}

		private static Double getDouble(String msg) {
			String entrada = JOptionPane.showInputDialog(msg);
			return Double.valueOf(entrada);
		}

	}


