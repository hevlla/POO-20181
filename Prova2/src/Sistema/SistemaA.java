package Sistema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;


public class SistemaA {
      
    public static void main(String[] args) throws IOException{
    
        ArrayList<Animal> lista = new ArrayList<>();
        
        File file = new File("teste.txt");
             
        InputStream arquivo = new FileInputStream("teste.txt");
        InputStreamReader config = new InputStreamReader(arquivo, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(config);
        
        String linha;
        int cont = 0;
        
        while((linha = reader.readLine()) != null){
            System.out.println(linha);
            cont++;
        }
        
        Herbívoros girafa = new Herbívoros();
        Alimentacao girafa1 = girafa; 
        girafa.setNome("Girafinha Claudio");
        girafa.setIdade(20);
        
        adicionaAnimal(girafa, lista);
        
        for (int i = 0; i < lista.size(); i++){
            Herbívoros girafa4 = (Herbívoros) lista.get(i);
            System.out.println(girafa4.getNome());
        }
        
        System.out.println(girafa1.comida());
        System.out.println(girafa.getNome());
        System.out.println(girafa.getIdade());
        
        OutputStream os = new FileOutputStream("teste.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        for (int i = 0; i < lista.size(); i++){
            Herbívoros animal = (Herbívoros) lista.get(i);
            bw.write(animal.getNome());
            bw.newLine();
        }
        
        bw.close();
        osw.close();
        os.close();
        
        while((linha = reader.readLine()) != null){
            System.out.println(linha);
            cont++;
        }
        
        config.close();
        arquivo.close();
        reader.close();
        
    }
    public static void adicionaAnimal(Animal g, ArrayList<Animal> lista){
        lista.add(g);
        System.out.println(g);
    }

}
