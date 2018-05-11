import java.util.Scanner;

class Lista01_09 {
	
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i;
		int num1;
		int num2;
		int soma;
		String num_par = "";
		String num_imp = "";
		
		
		System.out.println("Informe um número a ser percorrido: ");
		num1 = input.nextInt();

		System.out.println("Informe um número a ser percorrido: ");
		num2 = input.nextInt();		
		
		soma = (num1 + num2);
				
		if (num1 < num2) {

			for (i = num1; i <= num2; i += 1){
				if  ((i % 2) == 0){ 
					num_par += i;
					
					if(i < num2 -1){						
						num_par += " - ";
					}
				}
				else{
					num_imp += i;
		
					if(i < num2 -1){						
						num_imp += " - ";
					}
				}
			}
		}		
		else{
			for (i = num2; i <= num1; i += 1){
				if  ((i % 2) == 0){ 
					num_par += i;
					
					if (i < num1 -1){						
						num_par += " - ";
					}
				}
				else{
					num_imp += i;
							
					if (i < num1 - 1) {						
						num_imp += " - ";
					}
				}
			}		
		}

		num_imp += ".";
		num_par += "."; 
		System.out.println("Soma dos números " + num1 + " e " + num2 + " é: " + soma + "\nNumeros pares: " + num_par + "\nNúmero impares: " + num_imp);
		
	}		
}
