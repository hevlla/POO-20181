import java.util.Scanner;

class Lista01_08 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);

		int i;
		int nota;		
		int soma = 0;
		float media;
		int maior_num = 0;
		int menor_num = 10000;
		 
		for (i = 0; i < 10; i += 1){
					
			System.out.println("Informe a nota: ");
			nota = input.nextInt();	
			soma += nota;		
			
			if (nota > maior_num){
				maior_num = nota;		
			} 	
			if (nota < menor_num){
				menor_num = nota;
			}
		}
		
		media = (soma/10);
		
		System.out.println("A média é: " + media + "\nMaior nota: " + maior_num + "\nMenor nota: " + menor_num);

	}	
}
