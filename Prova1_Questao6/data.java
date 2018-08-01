public class data {
    private int dia;
    private int mes;
    private int ano;

    public data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}