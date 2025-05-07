/* (3) Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações. */

public class Musica {
    public String titulo;
    public String artista;
    public int anoDeLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;


    void fichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }


}
