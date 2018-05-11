import java.util.Scanner;

class Lista01_06 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num_diarias; 
		double taxa;
		String nome;
		float diaria = 60.00f;

		System.out.println("Informe seu nome: ");
		nome = input.nextLine();		
	
		System.out.println("Informe o número de diárias: ");
		num_diarias = input.nextInt();	
		
		if (num_diarias > 15) {
			taxa = 5.50 * num_diarias;
			diaria += taxa;
		} 
		else if (num_diarias == 15) {
			taxa = 6.00 * num_diarias;
			diaria += taxa;
		}
		else if (num_diarias < 15) {
			taxa = 8.00 * num_diarias;
			diaria += taxa;
			
		}

		System.out.println(nome + ", o total da sua conta é: R$" + diaria);
			

	}
}
