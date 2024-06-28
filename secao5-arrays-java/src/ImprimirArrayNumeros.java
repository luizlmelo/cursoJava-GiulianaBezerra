import java.util.Scanner;
/*Imprimir Array de Números
Crie um programa que lê um número inteiro n que representa a quantidade de números a serem inseridos pelo usuário e, em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.

Obs: Cada número deve ser impresso numa linha separada. Além disso a impressão deve ser feita depois da leitura de todos os números, e não durante.*/

public class ImprimirArrayNumeros {
    public static void main (String[] args) {
        // Sua solução aqui...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] valores = new int[n];

        for(int i = 0; i < n; i++){
            valores[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println(valores[i]);
        }
        sc.close();
    }
}