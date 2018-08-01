import java.util.Scanner;
public class gerenciamento {
    private Scanner input = new Scanner(System.in);
    private empresa Empresa = new empresa();

    public static void main(String[] args) {
        gerenciamento gerencia = new gerenciamento();
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Digite uma Ação!");
            System.out.println("1 ) - Cadastrar Funcionário.");
            System.out.println("2 ) - Mostrar Funcionarios Cadastrados");
            System.out.println("0 ) - Sair.");
            System.out.print(">>>  ");
            opcao = gerencia.input.nextInt();

            switch (opcao){
                case 1:
                    funcionario func = gerencia.cadastraFuncionario();
                    gerencia.Empresa.setFuncionarios(func);
                    break;
                case 2:
                    gerencia.listaFuncionarios();
                    break;
                case 0:
                    System.out.println("Programa Finalizado !!");
                default:
                    System.out.println("Opção invalida");
            }
        }
    }

    private funcionario cadastraFuncionario(){
        System.out.println("Cadastre uma matricula de 4 caracteres!");
        String matricula = "";
        while (matricula.length() != 4 || Empresa.getFuncionario(matricula) != null) {
            System.out.print("Cadastre uma Matricula:  ");
            matricula = input.next();

            if (matricula.length() != 4) {
                System.out.println("Matricula inválida");
            }
            if (Empresa.getFuncionario(matricula) != null) {
                System.out.println("Matrícula existente!");
            }
        }

        System.out.print("Digete seu nome:  ");
        input.nextLine();
        String nome = input.nextLine();

        System.out.println("Informe sua data de nascimento!");
        System.out.print("Dia:  ");
        int dia = input.nextInt();
        System.out.print("Mes:  ");
        int mes = input.nextInt();
        System.out.print("Ano:  ");
        int ano = input.nextInt();
        data dataNascimento = new data(dia, mes, ano);

        return new funcionario(matricula, nome, dataNascimento);
    }

    private void listaFuncionarios() {
        funcionario[] listaFunc = Empresa.getListFuncionarios();

        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < Empresa.getQuantFunc(); j++) {
                if (listaFunc[j].getNascimentoData().getMes() == i) {
                    System.out.println(listaFunc[j].getMatricula() + "    " +
                                        listaFunc[j].getNascimentoData().getMes() + "    " +
                                        listaFunc[j].getNome());
                }
            }
        }
    }
}
