public class ArrayStructure {
    public static void main(String[] args) {

        //Declarar e Inicializar
        String [] tarefas = {"Estudar Java", "Fazer exercícios", "Tomar café"};

        // Acessar posições do Array
        System.out.println(tarefas[0]);
        System.out.println(tarefas[1]);
        System.out.println(tarefas[2]);

        // Atualizar posições do Array
        tarefas[2] = "Limpar  a  casa";
        System.out.println(tarefas[2]);

        // Tamanho do Array
        System.out.println("Você possui "  +  tarefas.length + " tarefas.");
        // todos os arrays tem essa propriedade lenght
        // length  e  o out  (do system.out)  são  atributos

        // Percorrer / Iterar Arrays
        for(int i = 0; i < tarefas.length; i++){
            System.out.println(tarefas[i]);
        }

        // Percorrer / Iterar Arrays usando FOREACH
        for(String tarefa: tarefas){
            System.out.println(tarefa);
        }

        // Array Multidimensional
        // Dado tabular - linhas e colunas
        int [][] sudoku = {{3,6,7}, {4,9,8}, {5,2,1}};

        System.out.println(sudoku[0][0]); // acessa o número 3
        sudoku[0][0] = 1; // atualiza para o número 1 (linha 0 coluna 0)
        sudoku[2][2] = 3; // atualiza para o número 3 (linha 2 coluna 2)
        System.out.println(sudoku[0][0]);
        System.out.println(sudoku[2][2]);
        
        // loop dentro de loop
        for(int i =0; i < sudoku.length; i++){          // vai representar as linhas
            for(int j = 0; j < sudoku[i].length; j++){  // vai representar as colunas
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println(); // pula uma linha
        }

        // loop dentro de loop usando o FOREACH
        for(int[] linhaSudoku : sudoku){
            for(int numero : linhaSudoku){
                System.out.print(numero + " ");
            }
            System.out.println(); // pula uma linha
        }
    }
}

