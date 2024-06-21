package exerConhecendoBase;
/*
 * Escreva um programa que informe os relacionamentos de ordem existentes entre
 * dois números:
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual
 * 
 * 1. Ler 2 números
 * 2. Imprimeir relacionamentos de ordem
 * 
 * Ex: Dados os números 2 e 3:
 * 2 = 3 ? false, 2 != 3 ? true, ... , 2 <= 3 ? true
 */

import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número ");
        int numero2 = sc.nextInt();

        System.out.printf(numero1 + " = " + numero2 + " : " + (numero1 == numero2)+ "%n");
        System.out.printf(numero1 + " != " + numero2 + " : " + (numero1 != numero2)+ "%n");
        System.out.printf(numero1 + " > " + numero2 + " : " + (numero1 > numero2)+ "%n");
        System.out.printf(numero1 + " < " + numero2 + " : " + (numero1 < numero2)+ "%n");
        System.out.printf(numero1 + " >= " + numero2 + " : " + (numero1 >= numero2)+ "%n");
        System.out.printf(numero1 + " <= " + numero2 + " : " + (numero1 <= numero2)+ "%n");

        sc.close();
    }
}
