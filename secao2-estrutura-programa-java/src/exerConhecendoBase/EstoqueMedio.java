package exerConhecendoBase;

import java.util.Scanner;

/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 * 
 * Ex: quantidadeMinima = 3, quantidadeMaxima = 7: O estoque médio é de 5 unidades.
 */
public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade Minima: ");
        int quantidadeMinima = sc.nextInt();
        int quantidadeMaxima = sc.nextInt();
        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.printf("O estoque médio é de %d unidades%n", estoqueMedio);
        sc.close();
    }
}
