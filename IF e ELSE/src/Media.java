//02 Verificando aprovação em uma disciplina//

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("digite as notas do aluno(a)");
        System.out.println("Nota 1: ");
        double nota1 = imput.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = imput.nextDouble();
        System.out.println("Nota 3: ");
        double nota3 = imput.nextDouble();

        double mediaAritmetica = (nota1 + nota2 + nota3)/3;
        System.out.println("MÉDIA: " + mediaAritmetica);

        if (mediaAritmetica >= 7) {
            System.out.println("Aluno(a) APROVADO");
        }
        else if (mediaAritmetica >= 5 && mediaAritmetica < 7) {
            System.out.println("Aluno(a) está de RECUPERAÇÃO");
        }
        else{
            System.out.println("Aluno(a) REPROVADO");
        }
    }
}
