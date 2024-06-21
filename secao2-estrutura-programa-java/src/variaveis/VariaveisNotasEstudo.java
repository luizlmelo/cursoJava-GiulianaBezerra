package variaveis;
/*
 * Aula prática sobre variáveis no Java.
 * As variáveis são conteiners de dados
*/
public class VariaveisNotasEstudo {
    public static void main(String[] args) {
        // Variáveis que representam a data atual.
        int dia = 05;
        int mes = 06;
        int ano = 2024;

        // Atribuir novo valor para o dia.
        dia = 30;

        // Impressão da data atual.
        System.out.println("dia é: " + dia);
        System.out.println("mês é: " + mes);
        System.out.println("ano é: " + ano);


        // Podemos atribuir um tipo para várias variáveis
        int dias = 28, meses = 02, anos = 2029;

        System.out.println("dias é: " + dias);
        System.out.println("meses é: " + meses);
        System.out.println("anos é: " + anos);
    }
}
