import java.util.Scanner;

class Lista01_02 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int ano_nascimento;
		int ano_atual = 2018;
		int idade;

		System.out.println("Informa o ano de nascimento: ");		
		ano_nascimento = input.nextInt();
		
		idade = ano_atual - ano_nascimento;
		System.out.println("Você têm ou irá completar, " + idade + " anos"); 
		
	}
}
