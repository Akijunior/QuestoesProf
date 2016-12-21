
package application;

import javax.swing.JOptionPane;

import domain.Rectangle;


public class Principal {

	public static void main(String[] args) {
		
		String menu = "#### RT ####";
		menu += "\n 1 - Configurar Rect1";
		menu += "\n 2 - Configurar Rect2";
		menu += "\n 3 - Area do Rect1";
		menu += "\n 4 - Perimetro Rect1";
		menu += "\n 5 - Verificar se Rect1 está em Rect2";
		menu += "\n 0 - Sair. \n";
		
		Rectangle Retangulo1 = new Rectangle();
		Rectangle Retangulo2 = new Rectangle();
		
		int op = -1;
				
		while (op != 0) {
			
			op = getInt(menu);
			
			switch(op){
			
				case 1:
					double resp = getDouble("Diga o que deseja alterar (1 - Width/ 2 - Height): ");
					
					if (resp == 1) {
						Retangulo1.width = getDouble("Digite a nova largura: ");
						showMsg("A largura do rect1 foi alterada com sucesso! ");
						}
					
					else if (resp == 2) {
						Retangulo1.height = getDouble("Digite a nova altura: ");
						showMsg("A altura do rect1 foi alterada com sucesso! ");
						}
					
					else if (resp != 1 && resp != 2){
						getString("Opção inválida!");
					}
						
					//Config do rect1
					break;
					
				case 2:
					double resp2 = getDouble("Diga o que deseja alterar (1 - Width/ 2 - Height): ");
					if (resp2 == 1) {
						Retangulo2.width = getDouble("Digite a nova largura: ");
						showMsg("A largura do rect2 foi alterada com sucesso! ");
						}
					else if (resp2 == 2) {
						Retangulo2.height = getDouble("Digite a nova altura: ");
						showMsg("A altura do rect2 foi alterada com sucesso! ");
						}
					else if (resp2 != 1 && resp2 != 2) {
						getString("Opção inválida!");
					}
					
					//Config do rect2
					break; 
				
				case 3:
					getDouble("A Área do primeiro retângulo foi igual a: " + Retangulo1.area());
				
				case 4:
					getDouble("O Perímetro do primeiro retângulo foi igual a: " + Retangulo1.perimeter());
					
				case 0:
					//Sair
					break;
				default:
					showMsg("Error!");
					break;
					
			}
		}
		
	}

	
	

private static int showMsg(String string) {
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
