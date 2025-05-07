public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    public String titular;

    //Getters
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public double getSaldo() {
        return saldo;
    }


    //Setters
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
