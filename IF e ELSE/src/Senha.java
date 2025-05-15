//03 Validação de senha//

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        String senha = "123456";
        boolean vez = false;

        while (vez == false) {
            System.out.print("Digite a sua senha: ");
            String tentativa = imput.nextLine();

            if (tentativa.equals(senha)) {
                System.out.println("Acesso liberado");
                vez = true;
            }else{
                System.out.println("Senha incorreta, tente novamente");
                System.out.println();

            }
        }
    }
}
