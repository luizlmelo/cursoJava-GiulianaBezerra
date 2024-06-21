package exercicios;

import java.util.Scanner;

/*
 * crie uma calculadora de IMC que mostra em que classificação a pessoa está
 * 
 * Menor que 18,5    -> MAGREZA
 * Entre 18,5 e 24,9 -> NORMAL
 * Entre 25 e 29,9   -> SOBREPESO
 * Entre 30 e 39,9   -> OBESIDADE
 * Maior que 40      -> OBESIDADE GRAVE
 * 
 * IMC = peso / altura * altura
 * 
 */
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso:");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura:");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("MAGREZA");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("NORMAL");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("SOBREPESO");
        } else if(imc >= 30 && imc <= 39.9){
            System.out.println("OBESIDADE");
        } else if(imc >= 40){
            System.out.println("OBESIDADE GRAVE");
        } else{
            System.out.println("Dados inválidos");
        }
        sc.close();
    }
}
