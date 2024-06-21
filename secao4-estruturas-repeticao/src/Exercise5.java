import java.util.Scanner;

public class Exercise5 {

/* Fatorial
Você deve criar um programa Java que permita ao usuário calcular o fatorial de um número inteiro positivo. Lembre-se de que o fatorial de um número n é o produto de todos os inteiros positivos de 1 a n.

Por exemplo, se o usuário informar o número 7, o programa deve imprimir o fatorial de 7 que é 5040.*/


    public static void main(String[] args) {
        // Resolva o exercício aqui...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
    System.out.println(factorial);
        sc.close();
    }
}