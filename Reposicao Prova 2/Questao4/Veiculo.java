package Questao4;


public class Veiculo extends Piloto implements Dirigivel {
    private String combustivel;
    private Piloto[] pilotos;
    
    Veiculo() {}  
    
    Veiculo(String combustivel) {
        this.combustivel = combustivel;
    }
       
    @Override
    public void frear(){}
    
    @Override
    public void acelera(){}      
    
    public String getCombustivel(String combustivel) {
        return combustivel;
    }

    public String getCombustivel() {
        return combustivel;
                
    }

}
