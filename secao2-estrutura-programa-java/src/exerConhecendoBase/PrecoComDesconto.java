package exerConhecendoBase;
/*
 * Imprimir preço de um produto com base no desconto à vista e o valor economizado.
 * 
 * 1. Ler preço
 * 2. Ler % de desconto
 * 3. Imprimir o preço com desconto e valor economizado em reais
 * 
 * Ex: R$ 100,00 com 10% de desconto = O preço com desconto é R$ 90,00
 * e o valor economizado foi R$ 10,00
 */

import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        float produto = sc.nextFloat();

        System.out.println("Valor do desconto em %: ");
        float desconto = sc.nextFloat();

        float novoValor = produto - (produto * (desconto / 100));
        float valorEcnonomizado = produto - novoValor;

        System.out.printf("Valor com desconto é: R$ %.2f%n", novoValor);
        System.out.printf("Valor economizado é: R$ %.2f%n", valorEcnonomizado);

        sc.close();
    }
    
}
