package Application;

public class BalancoTrimestral {
	
	
	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosFevereiro + gastosJaneiro + gastosMarco;
		System.out.println(gastosTrimestre);
		double mediaMensal = gastosTrimestre/3.0;
		System.out.printf("Valor da média mensal = %.2f. ", mediaMensal);
	}

}
