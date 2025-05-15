//01 Verificando se um número é par ou ímpar//

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero positivo");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println(String.format("O numero %d é PAR",numero));
        } else {
            System.out.println(String.format("O numero %d é ÍNPAR",numero));
        }

        System.out.println();
    }
}
