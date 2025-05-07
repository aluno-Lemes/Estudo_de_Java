/* (4) Crie uma classe Carro com atributos modelo, ano, cor
e métodos para exibir a ficha técnica e calcular a idade do carro. */

public class Carro {
    String modelo;
    String cor;
    int ano;

    void fichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor do veiculo: " + cor);
        System.out.println("Ano de fabricação: " + ano);
    }

    int calcularIdade() {
        return 2025 - ano;
    }
}
