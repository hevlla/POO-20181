package Questao2;

public class Barco extends Veiculo implements Navegavel{
    int largura;
    int comprimento;
    
    @Override
    public String getCombustivel() {
        return null;
    }

    @Override
    public void localizacao() {}
}
