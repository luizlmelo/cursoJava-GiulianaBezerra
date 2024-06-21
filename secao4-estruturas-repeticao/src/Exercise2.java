import java.util.Scanner;

// Escreva um programa Java que imprima a soma dos números de 1 até um número inteiro positivo N, onde N é fornecido pelo usuário. O programa deve solicitar ao usuário que insira o valor de N e, em seguida, calcular e exibir a soma dos números de 1 até N.

// Ex: Se N = 5, a soma de 1 a N será 15.
// Importante: Imprima apenas a soma no seu programa, não imprima mais nenhuma mensagem para não comprometer a correção do exercício.
public class Exercise2 {
    public static void main(String[] args) {
        // Resolva o exercício aqui...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i <= n; i++){
            i += 1;
            soma += n;
        }
        System.out.println(soma);
        sc.close();
    }
}