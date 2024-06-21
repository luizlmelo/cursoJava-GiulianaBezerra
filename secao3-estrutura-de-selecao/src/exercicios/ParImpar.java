package exercicios;

import java.util.Scanner;

/*
 * Leia um número e imprima se ele é par ou ímpar
 */
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número PAR");
        }
        else{
            System.out.println("Número IMPAR");
        }
        sc.close();
    }
}
