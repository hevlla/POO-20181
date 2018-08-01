import java.util.Scanner;

public class media {
    private Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        media media = new media();

        String nome;
        int n1, n2;
        int Mat;
        float Mar;

        int con = 0;
        while (con < 50) {
            System.out.print("nome:  ");
            nome = media.input.next();
            System.out.print(("n1:  "));
            n1 = media.input.nextInt();
            System.out.print("n2:  ");
            n2 = media.input.nextInt();

            if ( n1 == 0 || n2 == 0 ) {
                System.out.println("Turma não merece ter nota computada!");
                break;
            }
            Mar = (n1 + n2)/2f;
            Mat = (int) Mar;
            System.out.println(Mar);

            if ( Mar > 7 ) {
                System.out.println("Aluno "+ nome + " Aprovado. Parabéns!");
            }
            else {
                if ( Mat >= 4 && Mat <= 6 ) {
                    System.out.println("Aluno "+ nome +" está na final!");
                }
                else {
                    System.out.println("Aluno "+ nome +"Reprovado!");
                }
            }
            con += 1;
        }
    }
}
