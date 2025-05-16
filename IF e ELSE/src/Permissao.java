//10 Verificação de código de acesso e nível de permissão//

import java.util.Scanner;

public class Permissao {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite a código de Acesso: ");
        String codigo = imput.nextLine();
        System.out.print("Digite o seu nivel de Permissão: ");
        int permissao = imput.nextInt();

        boolean validaSenha = codigo.equals("2023");
        boolean validaAcesso = permissao >=1 && permissao <=3;

        if (!validaSenha && !validaAcesso) {
            System.out.println("Código de acesso e Nível de Permissão invalido. ");
        }
        else if (!validaAcesso) {
            System.out.println("Nível de Permissão invalido. ");
        }
        else if (!validaSenha){
            System.out.println("Código de acesso invalido.");
        }else{
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        }
    }
}
