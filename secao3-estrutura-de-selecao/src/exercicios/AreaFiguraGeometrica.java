package exercicios;

import java.util.Scanner;

/*
 * Dada uma figura geométrica (retângulo, triângulo, círculo), informar a sua área.
 * 
 * retangulo = base x altura
 * triangulo = (base x altura) / 2
 * circulo = pi x (raio * raio)
 */
public class AreaFiguraGeometrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a figura (retangulo, triangulo ou circulo)");
        String figuraGeometrica = sc.next();

        switch(figuraGeometrica){
            case "retangulo" -> {
                System.out.println("Digite a base e altura");
                int base = sc.nextInt();
                int altura = sc.nextInt();

                int area = base * altura;
                System.out.println(area);
            }
            case "triangulo" -> {
                System.out.println("Digite a base e altura");
                int base = sc.nextInt();
                int altura = sc.nextInt();

                double area = (base * altura) /2.0;
                System.out.println(area);
            }
            case "circulo" -> {
                System.out.println("Digite o raio");

                int raio = sc.nextInt();

                double area = 3.14 * (raio * raio);
                System.out.println(area);
            }
            default -> System.out.println("Figura não suportada");
        }
        sc.close();
    }
}
