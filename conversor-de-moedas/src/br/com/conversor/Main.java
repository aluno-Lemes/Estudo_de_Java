package br.com.conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {

            System.out.print("""
                /--------- /-----------/--------- /-----------/--------- /
                Conversor de Moedas         
                /--------- /-----------/--------- /-----------/--------- /
                1) Real => Peso Agentino
                2) Real => Dólar 
                3) Real => Euro
                4) Dólar => Real
                5) Real => Dólar Australiano
                6) Dólar Canadense => Real
                7) Sair
                /--------- /-----------/--------- /-----------/--------- /
                Escolha uma opção válida:
                /--------- /-----------/--------- /-----------/--------- /
                """
            );
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Tente novamente.");
                sc.next();
            }

            switch (opcao) {
                case 1:
                    apiConverter("BRL","ARS",inAmount(sc));
                    break;
                case 2: ;
                    apiConverter("BRL","USD",inAmount(sc));
                    break;
                case 3:
                    apiConverter("BRL","EUR",inAmount(sc));
                    break;
                case 4:
                    apiConverter("USD","BRL",inAmount(sc));
                    break;
                case 5:
                    apiConverter("BRL","AUD",inAmount(sc));
                    break;
                case 6:
                    apiConverter("CAD","BRL",inAmount(sc));
                    break;
                case 7:
                    opcao = 7;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
            }
        }

    }
    static ExchangeApiClient client = new ExchangeApiClient();
    static CurrencyJsonParser parser = new CurrencyJsonParser();
    static ExchangeApiService service = new ExchangeApiService(client, parser);
    public static Valor apiConverter(String base, String target, double quantia) {

        try {
            Valor valor = service.convertCurrency(base, target, quantia);
            if (valor != null) {
                double converted = valor.converterAmount(quantia);
                System.out.printf("O valor de %.2f %s corresponde ao valor final de %.2f %s\n", quantia, base, converted, target);
                return valor;
            } else {
                System.out.println("Erro na conversão. Verifique os dados.");
            }
        } catch (Exception e) {
            System.out.println("Erro inesperado durante a conversão: " + e.getMessage());
        }
        return null;
    }

    public static double inAmount(Scanner in){
        while(true) {
            System.out.print("""
                    /--------- /-----------/--------- /-----------/--------- /
                    Digite o valor a ser convertido:
                    /--------- /-----------/--------- /-----------/--------- /
                    """);
            
            try {
                return in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Certifiquice que usar virgula para declarar valores decimais (ex: 4,39).");
                in.next();
            }
        }
    }
}
