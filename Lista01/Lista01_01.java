import java.util.Scanner;

class Lista01_01 {
	public static void main(String[] args){

		Scanner input = new Scanner (System.in);
		
		float velocidade;
		float kilometro = 3.6f;
		float transformando;
		
		System.out.printf("Informe a velocidade em m/s: ");
		velocidade = input.nextInt();
			
		transformando = (velocidade * kilometro);
		System.out.println(velocidade + " m/s, equivale à: " + transformando + " km/h.");
		
	}
}
