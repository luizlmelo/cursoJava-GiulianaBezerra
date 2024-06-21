import java.util.Scanner;

// Jogo de adivinhação

public class WhileStructure {
    public static void main(String[] args){
        int numero = 7, tentativas = 5;  // duas variáveis do mesmo tipo, na mesma linha 
        Scanner sc = new Scanner(System.in);

        while (tentativas > 0) {
            System.out.println("Digite um número entre 1 e 10:");
            int numeroFornecido = sc.nextInt();

            if (numeroFornecido == numero){
                System.out.println("Você acertou!");
                return;  // encerra o programa retornando um método
            } else {
                tentativas--;
            }
        }
        sc.close();
    }
}
