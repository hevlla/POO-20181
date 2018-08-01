public class funcionario {
    private String matricula;
    private String nome;
    private data nascimentoData;

    public funcionario(String matricula, String nome, data nascimentoData) {
        this.matricula = matricula;
        this.nome = nome;
        this.nascimentoData = nascimentoData;
    }

    public void setNascimentoData(data nascimentoData) {
        this.nascimentoData = nascimentoData;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public data getNascimentoData() {
        return nascimentoData;
    }
}