//06 Verificação de dia útil//

import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String dia = imput.nextLine();

        if (dia.equals("segunda")||dia.equals("terca")||dia.equals("quarta")||dia.equals("quinta")||dia.equals("sexta")) {
            System.out.println(dia + " é um dia Util!");
        } else if (dia.equals("sabado")||dia.equals("domingo")){
            System.out.println(dia + " não é um dia!");
        }
    }
}
