import java.util.Scanner;

/*Pirâmide de números
Crie um programa Java que lê um número n (no exemplo abaixo n é igual a 5) e gera um padrão de números crescentes da seguinte forma:
1
12
123
1234
12345

Dica: Utilize loops aninhados para resolver o problema.
*/
// Importante: Imprima apenas a pirâmide acima, nenhum texto a mais.

public class Exercise3 {
    public static void main(String[] args) {
        // Resolva o exercício aqui...
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){  
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}