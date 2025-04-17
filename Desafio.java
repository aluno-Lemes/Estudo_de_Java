import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Barry Allen";
        String conta = "Corrente";
        double saldo = 2000;

        System.out.println("//------//-----//-----//-----//");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n//------//-----//-----//-----//");

        String menu = """
                ## Digite sua opção ##
                1- Consultar Saldo
                2- Transferir Valor
                3- Receber Valor
                4- Sair
                """;

        int opcao = 0;
        while(opcao != 4) {
            System.out.println(menu);
            opcao = input.nextInt();

            if (opcao == 1){
                System.out.println(String.format("O saldo Atualizado é de %.2f Reais",saldo));
                System.out.println();

            } else if (opcao == 2) {
                System.out.println("Digite o valor da Transferencia a ser realizado");
                double valor = input.nextDouble();

                if (valor > saldo){
                    System.out.println("Não ha saldo suficiente para realizar a transfêrencia");
                    System.out.println();

                } else {
                    saldo -= valor;
                    System.out.println("Saldo Atualizado: R$" + saldo);
                    System.out.println();
                }

            } else if (opcao == 3) {
                System.out.println("Digite o valor Recebido");
                double valor = input.nextDouble();
                saldo += valor;
                System.out.println("Saldo Atualizado: R$" + saldo);
                System.out.println();

            } else if (opcao != 4) {
                System.out.println("Opção invalida");
                System.out.println();
            }
        }
        System.out.println("!! Programa encerrado !!");

    }
}