package Questao4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


public class TestaVeiculo {
    private Veiculo[] veiculo = new Veiculo[5];
    
    public void imprimeVeiculo(){
        for (int i = 0; i< veiculo.length; i++){
            System.out.println(veiculo[i].getCombustivel());
        } 
    }
    public void lerVeiculo() throws FileNotFoundException, IOException{
        InputStream is = new FileInputStream("lista_veiculos.txt");
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
    
    public void gravaVeiculo() throws FileNotFoundException, IOException{
        OutputStream os = new FileOutputStream("lista_veiculos.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        for (int i = 0; i < veiculo.length; i++){
            bw.write(veiculo[i].getCombustivel());
            bw.newLine();
        }
        
        bw.close();
        osw.close();
        os.close();
    }
    
    public static void main(String[] args) throws IOException{
        Veiculo veiculo = new Veiculo();
        TestaVeiculo testa = new TestaVeiculo();
        testa.veiculo[0] = new Veiculo("Alcool");
        testa.veiculo[1] = new Veiculo("Gasolina");
        testa.veiculo[2] = new Veiculo("Diesel");
        testa.veiculo[3] = new Veiculo("GNV");
        testa.veiculo[4] = new Veiculo("Biodesel");
        
        testa.imprimeVeiculo();
        testa.gravaVeiculo();
        testa.lerVeiculo();
        
        
    }
    
    
}
