package Questao2;

public abstract class Veiculo extends Piloto implements Dirigivel {
    String combustivel;
    private Piloto[] pilotos;

    Veiculo(String alcool) {}
    Veiculo() {}       

    @Override
    public void frear(){}
    
    @Override
    public void acelera(){}      

    public abstract String getCombustivel();

}
