//07 Verificando se um número está em um intervalo//

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite o valor que deseja para o emprestimo: ");
        double valor = imput.nextDouble();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println(String.format("emprestimo no valor de %.2f aprovado!", valor));
        } else {
            System.out.println(String.format("O valor %.2f, não está dentro do intervalo permitido para empréstimo.",valor));
        }
    }
}
