package reposicao;

public class Funcionario {
    private String nome;
    private int idade;
    private String matricula;
    private Data data_nascimento;
    private Endereco endereco;
    private String saidaAni;
    private String saidaEnd;
    
    public Funcionario(){}
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public Funcionario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Funcionario(String nome, int idade, Data data_nascimento){
        this.nome = nome;
        this.idade = idade;
        this.data_nascimento = data_nascimento;
        saidaAni = Integer.toString(data_nascimento.getDia()) + "/" + Integer.toString(data_nascimento.getMes()) + "/" + Integer.toString(data_nascimento.getAno());
    }
    
    public Funcionario(String nome, int idade, Data data_nascimento, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.data_nascimento = data_nascimento;
        this.endereco = endereco;
        saidaAni = Integer.toString(data_nascimento.getDia()) + "/" + Integer.toString(data_nascimento.getMes()) + "/" + Integer.toString(data_nascimento.getAno());
        saidaEnd = endereco.getLogradouro() + ", " + Integer.toString(endereco.getNumero()) + ", " + endereco.getComplemento();        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Data getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Data data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String obtemAtributos(){
        String saida = (nome + " " + Integer.toString(idade) + " " + saidaAni + " " + saidaEnd);
        return saida;
    }
}
