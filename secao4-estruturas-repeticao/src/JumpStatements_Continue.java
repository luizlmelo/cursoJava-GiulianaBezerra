public class JumpStatements_Continue {

    // Estrutura CONTINUE
    // Programa que vai usar um loop para imprimir todos os números impares entre 1 a 50

    public static void main(String[] args) {
        for(int i = 1; i <=50; i++){
            if (i % 2 != 0)
                continue;  // continua para o próximo loop (atualiza i++)
            System.out.println(i); // Imprime o valor se não for impar
        }        
    }
}
