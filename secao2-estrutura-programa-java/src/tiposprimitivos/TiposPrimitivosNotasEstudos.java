package tiposprimitivos;

/**
 * Notas de estudo sobre os tipos primitivos do java.base.
 * Tipos primitivos são providos pela linguagem nativamente.
 */
public class TiposPrimitivosNotasEstudos {
    public static void main(String[] args) {
        // Caracteres ou Characteres (aspas simples representa um caractere)
        char primeiraLetraDoNome = 'G'; 
        char primeiraLetraDoNomeASCII = 71;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        // Inteiros ou Integers
        byte nota = 10;  // -128 até 127
        short itensComprados = 2; // -32768 até 32767
        int quantidadeEstoque = 23366; // -2_147_483_648 até 2_147_483_647
        // (underline) funciona como um ponto ex. 1.000,00 = 1_000,00
        long numeroMuitoGrande = 3839492929393939393L; // 19 dígitos

        // Tipos Decimais
        float peso = 1.5f; // 6 até 7 casas decimais
        double preco = 24.99; // ~15 casas decimais

        // Booleanos ou Booleans
        boolean verdadeiro = true;
        boolean falso =  false;
    }
}
