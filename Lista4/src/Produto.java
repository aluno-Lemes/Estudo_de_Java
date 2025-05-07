public class Produto {
    private String nome;
    private double preco;

    //Getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem) {
        double desconto = preco * (porcentagem/100);
        preco -= desconto;
    }
}
