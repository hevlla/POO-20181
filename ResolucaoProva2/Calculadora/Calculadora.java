package Calculadora;

import java.util.Scanner;

public class Calculadora {
   
    public static void main (String[] args){
        Scanner entrada1 = new Scanner(System.in); 
        
        System.out.println("Informe os valores: ");
        int a = entrada1.nextInt();
        int b = entrada1.nextInt();
        
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao multi = new Multiplicacao();
        Divisao divisao = new Divisao();
               
        System.out.println(soma.Operacao(a, b));
        System.out.println(sub.Operacao(a, b));
        System.out.println(multi.Operacao(a, b));
        System.out.println(divisao.Operacao(a, b));
    }
}
