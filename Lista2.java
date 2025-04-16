import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //-----------//------------//------------(1)------------//------------//------------//
        //-Crie um programa que solicite ao usuário digitar um número.--------//------------//
        //-Se o número for positivo, exiba "Número positivo",---//------------//------------//
        //-caso contrário, exiba "Número negativo"./------------//------------//------------//
        //------------//------------//------------//------------//------------//------------//
        System.out.println("Digite um numero maior ou menor que 0");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("Você digitou 0");
        } else {
            if (num > 0) {
                System.out.println(String.format("o numero %d é POSITIVO!", num));
            } else {
                System.out.println(String.format("o numero %d é NEGATIVO!", num));
            }
        }
        System.out.println();


        //-----------//------------//------------(2)------------//------------//------------//
        //-Peça ao usuário para inserir dois números inteiros.--//------------//------------//
        //-Compare os números e imprima uma mensagem indicando se são iguais,-//------------//
        //-diferentes, o primeiro é maior ou o segundo é maior.-//------------//------------//
        //------------//------------//------------//------------//------------//------------//
        System.out.println("Digite 2 numeros inteiros");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 == num2) {
            System.out.println("Os numeros digitados são iguais");
        } else {
            if (num1 > num2) {
                System.out.println("O Primeiro Numero é Maior que o Segundo");
            } else {
                System.out.println("O Segundo Numero é Maior que o Primeiro");
            }
        }
        System.out.println();


        //-----------//------------//------------(3)------------//------------//------------//
        //-Crie um menu que oferece duas opções ao usuário:-----//------------//------------//
        //-"1. Calcular área do quadrado" e "2. Calcular área do círculo".----//------------//
        //-Solicite a escolha do usuário e realize o------------//------------//------------//
        //-cálculo da área com base na opção selecionada.-------//------------//------------//
        //------------//------------//------------//------------//------------//------------//
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = input.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = input.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = input.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        System.out.println();


        //------------//------------//------------(5)------------//------------//------------//
        //------Crie um programa que solicite ao usuário a entrada de um número inteiro.-----//
        //------Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.----//
        //------------//------------//------------//------------//-------------//------------//
        System.out.println("digite um numero inteiro");
        int num3 = input.nextInt();

        if (num3 % 2 == 0) {
            System.out.println("O numero escolhido é PAR");
        } else {
            System.out.println("O numero escolhido é IMPAR");
        }
        System.out.println();


        //------------//------------//------------(6)------------//------------//-------------//
        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número//
        //------------//------------//------------//-------------//------------//-------------//
        System.out.println("digite um numero para saber seu fatorial");
        int num4 = input.nextInt();
        int fatorial = 1;

        for (int k = 1; k <= num4; k++) {
            fatorial *= k;
        }
        System.out.println(String.format("O fatorial de %d é: %d", num4, fatorial ));


    }
}
