public class Lista1 {
    public static void main(String[] args) {

        //-----------//------------//------------(1)------------//------------//------------//
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.--//
        //------------//------------//------------//------------//------------//------------//
        double nota1 = 7.4;
        double nota2 = 5.8;

        double media = (nota1 + nota2)/2;
        System.out.println(media);
        System.out.println();


        //-----------//------------//------------(2)------------//------------//------------//
        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da //
        // variável double para int e imprima o resultado.------//------------//------------//
        //------------//------------//------------//------------//------------//------------//
        double numero = 5.5;
        System.out.println((int) numero);
        System.out.println();


        //-----------//------------//------------(3)------------//------------//------------//
        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).//
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.--//------------//
        //------------//------------//------------//------------//------------//------------//
        char letra = '%';
        String palavra = "Porcentagem: ";
        System.out.println(palavra + letra);
        System.out.println();


        //-----------//------------//------------(4)------------//------------//------------//
        //Declare uma variável do tipo double precoProduto------//------------//------------//
        // e uma variável do tipo int (quantidade). Calcule o valor total-----//------------//
        // multiplicando o preço do produto pela quantidade-----//------------//------------//
        // e apresente o resultado em uma mensagem./------------//------------//------------//
        //------------//------------//------------//------------//------------//------------//
        double precoProduto = 4.99;
        int quantidade = 12;
        double precoFinal = (precoProduto * quantidade);
        System.out.println(String.format("Cerveja Boa Unidade R$:%.2f comprando o fardo com %d Unidades sai por R$:%.2f", precoProduto, quantidade, precoFinal));
        System.out.println();


        //-----------//------------//------------(5)------------//------------//------------//
        //Declare uma variável do tipo double valorEmDolares.---//------------//------------//
        //Atribua um valor em dólares a essa variável.----------//------------//------------//
        //Considere que o valor de 1 dólar é equivalente a 4.94 reais.--------//------------//
        //Realize a conversão do valor em dólares para reais e imprima o resultado formatado//
        //------------//------------//------------//------------//------------//------------//
        double valorEmDolares = 573.30;
        double inflacao = 5.89;
        double conversaoDolar = (valorEmDolares * inflacao);
        System.out.println(String.format("U$%.2f Dolares são equivalentes a R$%.2f Reais. (1 Dolar = R$%.2f)", valorEmDolares, conversaoDolar, inflacao));
        System.out.println();


        //-----------//------------//------------(6)------------//------------//------------//
        //Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a----//
        //essa variável, representando o preço original de um produto. Em seguida, declare--//
        //uma variável do tipo double percentualDesconto e atribua um valor percentual de---//
        // desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto------//
        // em reais, aplique-o ao preço original e imprima o novo preço com desconto.-------//
        //------------//------------//------------//------------//------------//------------//
        double precoOriginal = 5.000;
        double percentualDesconto = 50;
        double desconto = (precoOriginal * percentualDesconto)/100;
        double ultimoValor = precoOriginal - desconto;
        System.out.println(String.format("valor do produto R$%.3f. Valor final R$%.3f com %.1f porcento de Desconto", precoOriginal, ultimoValor, percentualDesconto));

    }
}
