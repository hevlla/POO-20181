package reposicao;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    
    public Endereco(){}
    
    public Endereco(String logradouro, int numero, String complemento){
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
}
