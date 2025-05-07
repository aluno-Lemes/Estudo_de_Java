public class Principal {
    public static void main(String[] args) {

        //-----//--(1)--//-----//
        Pessoa pessoa = new Pessoa();
        pessoa.mensagem();

        System.out.println();


        //-----//--(2)--//-----//
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobro(5);
        System.out.println(resultado);

        System.out.println();


        //-----//--(3)--//-----//
        Musica minhaMusica = new Musica();
        minhaMusica.titulo  = ("BYOB");
        minhaMusica.artista = ("System Of a Down");
        minhaMusica.anoDeLancamento = 2001;

        minhaMusica.fichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println(String.format("Média das avaliações: %.2f",mediaAvaliacoes));
        System.out.println();


        //-----//--(4)--//-----//
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1998;
        meuCarro.cor = "Amarelo";

        meuCarro.fichaTecnica();

        System.out.println("Idade do veiculo: " + meuCarro.calcularIdade());
        System.out.println();


        //-----//--(5)--//-----//
        Aluno aluno = new Aluno();
        aluno.idade = 16;
        aluno.nome = "João";

        aluno.exibeDados();
    }
}





