public class empresa {
    private funcionario[] funcionarios = new funcionario[30];
    private int quantFunc;

    public void setFuncionarios(funcionario funcionarios) {
        this.funcionarios[quantFunc] = funcionarios;
        setQuantFunc();
    }

    private void setQuantFunc() {
        this.quantFunc += 1;
    }

    public funcionario[] getListFuncionarios() {
        return funcionarios;
    }

    public funcionario getFuncionario(String matricula) {
        for (int i = 0; i < quantFunc; i++) {
            if (funcionarios[i].getMatricula().equals(matricula)) {
                return funcionarios[quantFunc];
            }
        }
        return null;
    }

    public int getQuantFunc() {
        return quantFunc;
    }
}