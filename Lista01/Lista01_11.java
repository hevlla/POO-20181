import java.util.Scanner;

class Lista01_11 {

	static public void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int escolha;
		int qtd_pedidos = 0;
		float preco = 0.00f;
	
		System.out.print("Menu:\n");
		System.out.print("Código		Produto			Preço(R$)\n");
		System.out.print("  10		Pastel de carne		  1,50\n");
		System.out.print("  11		Coxinha de frango	  1,80\n");	
		System.out.print("  12		Empada de frango	  1,90\n");
		System.out.print("  20		Hamburguer		  10,00\n");
		System.out.print("  30		Pizza			  8,00\n");
		System.out.print("  50		Suco			  2,50\n");
		System.out.print("  0		----Sair---------		\n");
		
		while (true){
			System.out.println("Informe o código: ");		
			escolha = input.nextInt();
				
			if (escolha == 0){
				break;
			}

			else if (escolha == 10){
				qtd_pedidos += 1; 
				preco += 1.50;
			}
			else if (escolha == 11){
				qtd_pedidos += 1; 
				preco += 1.80;
			}
			else if (escolha == 12){
				qtd_pedidos += 1; 
				preco += 1.90;
			}
			else if (escolha == 20){
				qtd_pedidos += 1; 
				preco += 10.00;
			}
			else if (escolha == 30){ 
				qtd_pedidos += 1;
				preco += 8.00;
			}
			else if (escolha == 50){
				qtd_pedidos += 1;
				preco += 2.50;
			}		
		} 
				
		System.out.println("Foram realizados " + qtd_pedidos + " pedidos.\nTotal: R$" + preco);
	}
}
