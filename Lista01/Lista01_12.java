import java.util.Scanner;

class Lista01_12{

	public static void main (String[] args){
	
		Scanner input = new Scanner(System.in);
		
		int cont;
		int quadrado = 0;
		int cubo = 0;

		System.out.println("Número	Quadrado   Cubo");

		for(cont = 0; cont < 10; cont += 1){
			quadrado = cont*cont;
			cubo = quadrado *cont;
			System.out.println("  " + cont + "	   " + quadrado + "	    " + cubo);			
		}
	}
}
