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
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dois números");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Digite a operação (+, -, *, /):");
        String operador = sc.next();

        int resultado;

        if (operador.equals("+")){
            resultado = num1 + num2;
            System.out.println("A soma é: " + resultado);
        } else if (operador.equals("-")){
            resultado = num1 - num2;
            System.out.println("A subtração é: " + resultado);
        } else if (operador.equals("*")){
            resultado = num1 * num2;
            System.out.println("A multiplicação é: " + resultado);
        } else if (operador.equals("/")){
            resultado = num1 / num2;
            System.out.println("A divisão é: " + resultado);
        } else {
            System.out.println("Entradas inválidas!");
        }
        sc.close();
    }
}
