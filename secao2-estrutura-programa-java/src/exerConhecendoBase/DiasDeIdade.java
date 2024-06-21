package exerConhecendoBase;

import java.util.Scanner;

/*
 * Escreva um programa que leia uma idade em anos e imprima
 * essa idade em dias
 * 
 * Ex: 1 ano ==> 365 dias de idade
 */
public class DiasDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        int idadeDias = idade * 365;
        System.out.printf("A idade em dias é: %d dias%n", idadeDias);
        sc.close();
    }
}
