public class Principal {
    public static void main(String[] args) {
        //-----//--(1)--//-----//
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroDaConta(404);
        conta.setSaldo(537);
        conta.titular = "Lucas";

        System.out.println("Numero da Conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(2000);
        System.out.println("Novo Saldo: " + conta.getSaldo());
        System.out.println();

        //-----//--(2)--//-----//
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Claudio");
        pessoa.setIdade(36);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        if (pessoa.getIdade() >= 18) {
            System.out.println(String.format("%s tem %d anos, portanto ele é MAIOR de idade",pessoa.getNome(),pessoa.getIdade()));
        } else {
            System.out.println(String.format("%s tem %d anos, portanto ele é MENOR de idade",pessoa.getNome(),pessoa.getIdade()));
        }
        System.out.println();

        //-----//--(3)--//-----//
        Produto produto = new Produto();

        produto.setNome("Gol bolinha 4 portas");
        produto.setPreco(5350.99);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(15);
        System.out.println(String.format("Preco com desconto: %.2f",produto.getPreco()));
        System.out.println();

        //-----//--(4)--//-----//
        Aluno aluno = new Aluno();

        aluno.setNome("Marcia Aparecida");
        aluno.setNota1(8.3);
        aluno.setNota2(6.3);
        aluno.setNota3(5.9);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println(String.format("Notas: Matematica:%.2f  Portugues:%.2f   Historia:%.2f ", aluno.getNota1(), aluno.getNota2(), aluno.getNota3()));

        System.out.println(String.format("Média Final: %.2f",aluno.calcularMedia()));
        System.out.println();

        //-----//--(5)--//-----//
        Livro livro = new Livro();

        livro.setAutor("Monteiro Lobato");
        livro.setTitulo("Sitio do PicaPau Amarelo");

        livro.exibirDetalhes();
    }
}

