import java.util.Scanner;

public class Exercise4 {

/*Imprimindo o maior número
Crie um programa Java que solicita ao usuário uma série de números e quando ele digitar um número negativo, o programa irá encerrar e imprimir o maior número entre os digitados. Você deve utilizar estruturas de repetição para coletar os números e determinar qual é o maior.

Ex: Suponha que o usuário insira os seguintes números: 5, 12, 8, 25, 3, -1. A saída do programa deve ser: 25.*/
// Importante: Imprima apenas o maior número e nenhum texto adicional!

    public static void main(String[] args) {
        // Resolva o exercício aqui...
        Scanner sc = new Scanner(System.in);
        int maiorNumero = 0;
 
        while (true) {
            int numero = sc.nextInt();
 
            if (numero < 0) {
                break;
            }
 
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
 
        System.out.println(maiorNumero);
        sc.close();
    }
}