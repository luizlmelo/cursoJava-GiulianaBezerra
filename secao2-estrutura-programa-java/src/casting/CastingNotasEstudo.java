package casting;

/*
 * Casting: Operação de transformar um tipo de dados em outro.
 * Widening Casting vs Narrowing Casting
 */
public class CastingNotasEstudo {
    public static void main(String[] args) {

        // Widening Casting (Implícito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variavelGrande);
        System.out.println(variavelInt);


        // Narrowing Casting (Explícito) - pode haver perda de dados.
        long variavelLong = 3939393939339944532L;
        int variavelInt2 = (int)variavelLong;
        System.out.println(variavelInt2);


        // Operações de divisão entre números inteiros.
        // Divisão de dois int vai dar como resultado um número inteiro 9 /2 = 4
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao = (float)numero1 / numero2;
        System.out.println("Resultado da divisão é: " + resultadoDivisao);
    }
}
