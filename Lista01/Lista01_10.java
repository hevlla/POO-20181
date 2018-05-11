import java.util.Scanner;

class Lista01_10 {

	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
	
		int contador = 0;
		float numero = 0.0f;
		float ultima_d = 0.0f;

		System.out.println("Informe um número: ");
		numero = input.nextInt();
		
		if (numero == 1){
			contador = 0;
			ultima_d = 0;
		}
		else{
			while (true){
				if (numero < 1){
					break;		
				}
				else {
					numero /= 2;
					ultima_d = numero;
					contador += 1;
				}
						
			}
		}
		
		System.out.println("Última divisão: " + ultima_d + "\nQuantidade de divisões efetuadas: "+ contador);
	}
}
