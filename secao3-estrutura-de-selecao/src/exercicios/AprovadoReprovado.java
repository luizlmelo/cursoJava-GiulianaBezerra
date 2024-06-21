package exercicios;

import java.util.Scanner;

/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */
public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();


        if ((nota1 + nota2 + nota3) / 3 >= 7.0){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

        // if ((nota1 + nota2 + nota3) / 3 >= 7.0){
        //     System.out.println("Aprovado");
        // }else{
        //     System.out.println("Reprovado");
        // }

        sc.close();
    }   
}
