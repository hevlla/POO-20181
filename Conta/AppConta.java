public class AppConta {
	
	public static void main(String args[]){
		Conta_Hevlla c1, c2;
		c1 = new Conta_Hevlla();
		c2 = new Conta_Hevlla();
		
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
