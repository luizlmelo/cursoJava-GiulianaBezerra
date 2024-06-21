package exerConhecendoBase;
/*
 * Faça um programa que converta um valor em dólar em reais.
 * 
 * Ex: Dólares = 100, Cotação = 4,92 => O valor em reais é R$ 492,00.
 */

import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor em dólar: ");
        float dolar = sc.nextFloat();

        System.out.println("Digite a cotação do dólar: ");
        float cotacao = sc.nextFloat();

        System.out.printf("O valor em reais é R$ %.2f%n", (dolar * cotacao));
        sc.close();
}  
    }
   
