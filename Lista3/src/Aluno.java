/* (5) Crie uma classe Aluno com atributos nome, idade,
e um metodo para exibir informações. Crie uma instância da classe Aluno,
atribua valores aos seus atributos e utilize o metodo para exibir as informações.*/

public class Aluno {
    String nome;
    int idade;

    void exibeDados() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }
}
