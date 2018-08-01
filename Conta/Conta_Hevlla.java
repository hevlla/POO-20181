class Conta_Hevlla {
	
	private int numero;
	private String nomeDono = "Hevlla";
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
