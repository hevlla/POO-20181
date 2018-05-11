import java.util.Scanner;

class Lista01_03 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in); 		
		
		float nota1;
		float nota2;		
		float nota3;
		float media;
		float soma;
		int peso1 = 2;
		int peso2 = 3;
		int peso3 = 5;
		
		System.out.println("Informe a nota da primeira prova: ");
		nota1 = input.nextInt();
		
		System.out.println("Informe a nota da segunda prova: ");
		nota2 = input.nextInt();

		System.out.println("Informe a nota da terceira prova: ");
		nota3 = input.nextInt();

		soma = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
		media = soma/(peso1 + peso2 + peso3);
		
		System.out.println("A média ponderada das notas é " + media);	
	} 
}
