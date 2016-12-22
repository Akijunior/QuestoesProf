package Application;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioX {
	
	public static void main(String[] args) {
		
		for(int i=150; i < 301; i++) {
			System.out.println(i+"\n");
		}
		
		int soma = 0;
		
		for(int l=1; l < 1001; l++) {
			soma += l;
		}
		System.out.println("Soma de numeros de 1 a 1000 igual a " + soma + "\n");
		
		for(int u=1; u < 101; u++) {
			if(u%3==0) 
				System.out.println(u);
			}
		System.out.println("\n");
		
		for(int n=1; n < 11; n++) {
			int fat = 1;
			int v = n;
			while (v > 1) {
				fat *= v;
				v -= 1;
			}
			System.out.printf("O valor do fatorial %d é igual a %d.\n", n, fat);
			fat = 0;
		}
		
		int inicio = 0, meio = 1, fib = 0;
		System.out.println("Fibbonacci: 0.");
		while (fib < 100) {
			
			System.out.println("Fibbonacci: " + meio + ".");
			fib = inicio + meio;
			inicio = meio;
			meio = fib;
		}
		System.out.println("Fibbonacci: " + meio + ".");
		
		Scanner pontoDePartida = new Scanner(System.in);
		double caixaDeEntrada = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser submetido: "));
		
		while(caixaDeEntrada != 1) {
			if (caixaDeEntrada%2==0) {
				caixaDeEntrada = caixaDeEntrada/2;
			}
			
			else if (caixaDeEntrada%2!=0) {
				caixaDeEntrada = 3 * caixaDeEntrada + 1;
			}
			System.out.println(caixaDeEntrada);
		}
	}

		
	}
	

