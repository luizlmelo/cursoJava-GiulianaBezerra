public class Casa {
    // As variáveis aqui são atributos.
    boolean inteligente;

    public Casa(){
    }

    public Casa(boolean inteligente){
        this.inteligente = inteligente;
    }

    // void não retorna nada, se quisermos retornar algo. Precisamos colocar int, String
    // ou qualquer que seja o tipo no lugar do void. Void significa vazio.
    // Void (palavra reservada da linguagem) é usada para retornar método.
    // acenderLuz é o tipo do identificador.
    void acenderLuz(){
        if (inteligente)
            System.out.println("Comando de voz");
        else
            System.out.println("Pressionar interruptor");
    }
}
