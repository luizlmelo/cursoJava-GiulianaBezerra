package io;

import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados de Java.
 * Entrada de dados: Ler dados digitados pelo usuário.
 * Sáida de dados: Escrever dados para o usuário.
 */
public class IoNotasEstudo {
    public static void main(String[] args) {
        // Leitura de dados de entrada
        System.out.println("Digite um número");
        Scanner scanner = new Scanner(System.in);
        int valorDigitado = scanner.nextInt();  // Entrada de dados
        System.out.println("Número digitado: " + valorDigitado);  // Saída de dados
        scanner.close();


        // Sáida de dados
        float qualquerNumero1 = 3.0f;
        System.out.printf("O n digitado foi %d%n", valorDigitado);
        System.out.printf("O n digitado foi %f%n", qualquerNumero1);

        float qualquerNumero2 = 33;
        System.out.printf("O número float é: %.2f%n", qualquerNumero2);
    }
}
