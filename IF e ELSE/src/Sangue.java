//09 Verificação de compatibilidade de doação de sangue//

import java.util.Scanner;

public class Sangue {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        int idade = imput.nextInt();

        if (idade >= 18 && idade <= 65) {
            System.out.print("Digite o peso do doador: ");
            double peso = imput.nextDouble();

            if (peso < 50) {
                System.out.println("O doador não é compatível.");
                System.out.println("Motivo: peso minimo 50kg");
            } else {
                System.out.println("O doador é compativel");
            }
        } else {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        }
    }
}
