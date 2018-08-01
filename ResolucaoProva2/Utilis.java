import java.util.Scanner;

public class Utilis {
	public static void main (String args[]) throws FahrenheitExeption {
		double fahrenheit;
		double celcius;


		Scanner ler = new Scanner(System.in);

		System.out.println("Informe o valor em Fahrenheit: ");
		fahrenheit = ler.nextDouble();


		celcius = (5*(fahrenheit - 32))/9;
		
		toCelsius(celcius);
	}
	public static void toCelsius(double celcius) {
		if (celcius < -459.67){
			FahrenheitExeption exeption = new FahrenheitExeption();
		}else{
			System.out.println(celcius);
		}
		}
}



