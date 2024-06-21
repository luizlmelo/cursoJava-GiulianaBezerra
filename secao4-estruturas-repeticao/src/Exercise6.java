import java.util.Scanner;

public class Exercise6 {

/*Sequência de Fibonacci
A Sequência de Fibonacci é uma série matemática em que cada número subsequente é a soma dos dois números anteriores. Começando com 0 e 1, os primeiros termos da sequência são 0, 1, 1, 2, 3, 5, 8, 13, 21 e assim por diante. Por exemplo, dado o número 7, o termo fibonacci é 13.

Você deve criar um programa Java que permita ao usuário informar um número e calcule o termo da Sequência de Fibonacci correspondente a esse número inteiro positivo. */

    public static void main(String[] args) {
        // Resolva o exercício aqui.
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
    
        if (numero <= 0) {
            System.out.println(0);
            sc.close();
            return;
        } else if (numero == 1) {
            System.out.println(1);
            sc.close();
            return;
        }
    
        long termoAnterior = 0;
        long termoAtual = 1;
        long termoFibonacci = 0;
    
        for (int i = 2; i <= numero; i++) {
            termoFibonacci = termoAnterior + termoAtual;
            termoAnterior = termoAtual;
            termoAtual = termoFibonacci;
        }
    
        System.out.println(termoFibonacci);
        sc.close();
    }
}