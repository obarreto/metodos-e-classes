package one.digitalinnovation.basecamp.metodos1;

public class Emprestimo {
	
	public static int getUmaParcela() {
		return 1;
	}
	
	public static int getDuasParcelas() {
		return 2;
	}
	
	public static int getTresParcelas() {
		return 3;
	}
	
	public static double getTaxaUmaParcela() {
		return 0.15;
	}
	
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	
	public static double getTaxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) {
		
		if(parcelas == 1) {
			
			double valorFinal = valor + (valor * getTaxaUmaParcela());
			
			System.out.println("Valor final empréstimo para 1 parcela: R$ " + valorFinal);
			
		} else if(parcelas == 2) {
			
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			
			System.out.println("Valor final empréstimo para 2 parcelas: R$ " + valorFinal);
		} else if (parcelas == 3) {
			
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			
			System.out.println("Valor final empréstimo para 3 parcelas: R$ " + valorFinal);
		} else {
			System.out.println("Quantidade de parcelas não é aceita.");
		}
	}
}
