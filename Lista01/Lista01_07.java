import java.util.Scanner;

class Lista01_07{

	public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);
	
		int nota;

		System.out.println("Informe sua nota: ");
		nota = input.nextInt();
		
		if (0 <= nota && nota <= 49){
			System.out.println("Conceito: Insuficiente.");
		}
		else if (50 <= nota && nota <= 64) {
			System.out.println("Conceito: Regular.");
		}			
		else if (65 <= nota && nota <= 84) {
			System.out.println("Conceito: Bom.");		
		}
		else{
			System.out.println("Conceito: Ótimo.");
		}	
	}
}

