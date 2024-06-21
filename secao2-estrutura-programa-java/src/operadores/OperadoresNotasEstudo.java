package operadores;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {

        // OPERADORES ARTIMÉTICOS
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);
    
        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
        System.out.println("A subtração é: " + subtracao);

        int numero5 = 5;
        int numero6 = 6;
        int multiplicacao = numero5 * numero6;
        System.out.println("A multiplicação é: " + multiplicacao);

        int numero7 = 7;
        int numero70 = 70;
        int divisao = numero70 / numero7;
        System.out.println("A divisão é: " + divisao);

        int numero8 = 8; 
        int numero81 = 81;
        int modulo = numero81 % numero8;  // resto da divisão
        System.out.println("O resto da divisão do módulo é: " + modulo);

        int contador = 0;
        contador++;  // Incrementa
        System.out.println("O valor do contador incrementando é: " + contador);

        contador--;  // Decrementa
        System.out.println("O valor do contador decrementando é: " + contador);


        // OPERADORES RELACIONAIS 
        double decimal1 = 1.0;
        double decimal2 = 2.0;
        boolean ehMaior = decimal2 > decimal1;
        System.out.println("É maior? " + ehMaior);
        // > Maior que 
        // < Menor que
        // >= Maior ou igual que
        // <= Menor ou igual que 
        // == Igual a 
        // != Diferente de


        // OPERADORES DE ATRIBUIÇÃO
        int variavel = 1;
        variavel += 4;
        System.out.println("Atribuição soma é: " + variavel);
        // = Atribuição
        // += Atribuição soma
        // -= Atribuição subtração
        // *= Atribuição multiplicação
        // /= Atribuição divisão
        // %= Atribuição módulo


        // OPERADORES LÓGICOS
        int valor1 = 4;
        int valor2 = 2;
        boolean expressao = valor1 < 10 && valor2 <10;
        System.out.println("O valor da expressão é: " + expressao);
        // && : E / AND (todas precisam ser verdadeiras = V)
        // || : OU / OR (pelo menos uma verdadeira = V)
        // ! : NEGAÇÃO / NOT (nega uma expressão)
    }
}
