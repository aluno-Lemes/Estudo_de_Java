//05 Verificação de desconto em compras//

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double compra = imput.nextDouble();

        double desconto = compra * 0.10;

        if (compra >= 100) {
            System.out.println("Desconto de 10% aplicado");
            System.out.println("Valor Total: " + (compra - desconto));
        } else {
            System.out.println("Nenhum desconto foi aplicado");
            System.out.println("Valor Total: " + compra);
        }
    }
}
