package exercicios;

import java.util.Scanner;

/*
 * Crie uma calculadora que dados 2 números e uma operação
 * (adição, subtração, multiplicação e divisão), retorne o
 * resultado dessa operação entre os dois números.
 * 
 * Ex:
 * 1 2 * => 1 * 2 = 2
 */
public class Calculadora2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dois números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Digite a operação (+, -, *, /):");
        String operador = sc.next();

        switch(operador){
            case "+" -> System.out.printf("%d %s %d = %d", num1, operador, num2, num1 + num2);
            case "-" -> System.out.printf("%d %s %d = %d", num1, operador, num2, num1 - num2);
            case "*" -> System.out.printf("%d %s %d = %d", num1, operador, num2, num1 * num2);
            case "/" -> System.out.printf("%d %s %d = %d", num1, operador, num2, num1 / num2);
            default -> System.out.println("Operador inválido!");
        }
        sc.close();
    }
}
