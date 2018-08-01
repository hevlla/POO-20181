class Conta_Laryssa {
	
	private int numero;
	private String nomeDono = "Laryssa";
	private double saldo;
	private double limite;

	public void setSaldo (double valor){
		saldo = valor;
	}
	
	public double getSaldo (){
		return (saldo);
	}

	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public double sacar(double valor){
		if (valor <= saldo){
			saldo = saldo - valor;
		}
		
		else {
			return -1;
		}
		return saldo;
	}
}

public class AppConta_Laryssa {
	
	public static void main(String args[]){
		Conta c1, c2;
		c1 = new Conta();
		c2 = new Conta();
		
		c1.setSaldo(500);
		c2.setSaldo(800);
		
		System.out.println("Saldo c1: " + c1.getSaldo());
		System.out.println("Saldo c2: " + c2.getSaldo());
		
		c1.depositar(300);
		c2.sacar(800);

		System.out.println("Saldo c1: " + c1.getSaldo());
		System.out.println("Saldo c2: " + c2.getSaldo());
	}
}
