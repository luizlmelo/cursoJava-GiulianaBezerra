package estrutura_switch;

import java.io.Console;

public class ChecadorNotas {
    public static void main(String[] args) {
        // A, B, C, D ou F
        Console console = System.console();

        System.out.println("Informe a nota (A, B, C, D, F): ");
        String nota = console.readLine();

        switch(nota){
            case "A" -> System.out.println("Excelente!");
            case "B" -> System.out.println("Bom trabalho!");
            case "C" -> System.out.println("Está progredindo!");
            case "D" -> System.out.println("Precisa melhorar!");
            case "F" -> System.out.println("Você falhou!");
            default -> System.out.println("Opção inválida!BG");
        }

        // PODEMOS USAR DA SEGUINTE MANEIRA
        String mensagem = switch(nota){
            case "A" -> "Excelente!";
            case "B" -> "Bom trabalho!";
            case "C" -> "Está progredindo!";
            case "D" -> "Precisa melhorar!";
            case "F" -> "Você falhou!";
            default -> "Opção inválida!BG";
        };
        System.out.println(mensagem);
    }
}



