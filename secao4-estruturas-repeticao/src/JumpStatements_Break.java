import java.util.Scanner;

public class JumpStatements_Break {

    // Estrutura BREAK  
    // Interrompe a execução quando digitar o número 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            if (numero == 1) // quando for apenas o if (não precisa colocar {})
                break;
        }
        System.out.println("Ufa, acabou o loop!");
        sc.close();   
    }
}
