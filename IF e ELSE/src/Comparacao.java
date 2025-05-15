//04 Comparando dois números//

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double numero1 = imput.nextDouble();
        System.out.print("Agora digite o segundo numero: ");
        double numero2 = imput.nextDouble();

        if (numero1 > numero2) {
            System.out.println(String.format("O numero %.2f é MAIOR que %.2f",numero1,numero2));
        }
        else if (numero1 == numero2) {
            System.out.println("OS 2 numeros são iguais");
        }
        else {
            System.out.println(String.format("O numero %.2f é MENOR que %.2f",numero1,numero2));
        }


    }
}
