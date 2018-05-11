import java.util.Scanner;
	
class Lista01_04 {
	public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float cmedia = 7.0f;
		float fmedia = 5.0f;
		float media;
		
		System.out.println("Informe a nota da primeira prova: ");
		nota1 = input.nextInt();
		
		System.out.println("Informe a nota da segunda prova: ");
		nota2 = input.nextInt();

		System.out.println("Informe a nota da terceira prova: ");
		nota3 = input.nextInt();

		System.out.println("Informe a nota da quarta prova: ");
		nota4 = input.nextInt();

		media = (nota1 + nota2 + nota3 + nota4)/4 ;

		if (media >= cmedia){
			System.out.println("A media do aluno é: " + media + "\nO aluno foi aprovado");		
		}  
		else if (media >= fmedia && media < cmedia){
			System.out.println("A media do aluno é: " + media + "\nO aluno vai para final");
		}
		else{
			System.out.println("A media do aluno é: " + media + "\nO aluno foi reprovado");
		}

	}
}
