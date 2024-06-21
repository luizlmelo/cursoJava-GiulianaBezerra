package exercicios;

import java.util.Scanner;

/*
 * Dada a idade do atleta, imprima sua categorai:
 * 
 * Mirim: 10 a 12 anos
 * Infantil: 13 a 15 anos
 * Juvenil: 16 a 18 anos
 */
public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a idade do atleta: ");
        int idade = sc.nextInt();

        if (idade >= 10 && idade <= 12){
            System.out.println("Mirim");
        }
        else if (idade >= 13 && idade <= 15){
            System.out.println("Infantil");
        }
        else if (idade >= 16 && idade <= 18){
            System.out.println("Juvenil");
        }
        else{
            System.out.println("Idade inválida!");
        }

        sc.close();
    }
}
