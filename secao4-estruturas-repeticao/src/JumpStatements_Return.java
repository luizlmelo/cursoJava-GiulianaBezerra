import java.util.Scanner;

public class JumpStatements_Return {

    // Estrutura RETURN  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();

            if (numero == 1){ // quando for apenas o if (não precisa colocar {})
                System.out.println("Ufa, acabou o loop!");
                sc.close(); // antes de retornar, precisamos fechar o scanner 
                return; // vai encerrar o programa
            }
        }
    }
}
