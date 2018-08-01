package reposicao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class TestaFuncionario {
    private Funcionario[] funcionarios = new Funcionario[5];
    
    public void imprimeFuncionario(){
        for (int i = 0; i< funcionarios.length; i++){
            System.out.println(funcionarios[i].obtemAtributos());
        }
    }
    
    public void lerFuncionario() throws FileNotFoundException, IOException{
        InputStream is = new FileInputStream("array_funcionario.txt");
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        
        String linha;
        int cont = 0;
        
        while ((linha = br.readLine()) != null ){
            System.out.println(linha);
            cont++;
        }
        
        br.close();
        isr.close();
        is.close();
    }
    
    public void gravaFuncionarios() throws FileNotFoundException, IOException{
        OutputStream os = new FileOutputStream("array_funcionario.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        for (int i = 0; i < funcionarios.length; i++){
            bw.write(funcionarios[i].obtemAtributos());
            bw.newLine();
        }
        
        bw.close();
        osw.close();
        os.close();
    }
    
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("array_funcionario.txt");
        
        TestaFuncionario testa = new TestaFuncionario();
        testa.funcionarios[0] = new Funcionario();
        testa.funcionarios[1] = new Funcionario("José");
        testa.funcionarios[2] = new Funcionario("Maria", 34);
        Data data = new Data(22, 07, 1997);
        testa.funcionarios[3] = new Funcionario("João", 37, data);
        Data data1 = new Data(07, 02, 1998);
        Endereco endereco = new Endereco("Presidente Costa e Silva", 585, "Casa");
        testa.funcionarios[4] = new Funcionario("Clara", 20, data1, endereco);
        
        testa.gravaFuncionarios();
        testa.imprimeFuncionario();
        testa.lerFuncionario();
    }
    
}
