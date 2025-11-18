public class Main {
    public static void main(String[] args) {
        /* Números Inteiros = 100, 234343, 255, 192, 999999999999993
        byte =>8 bits = > -128 a 127
        // byte minhaVar= 130; da erro
        short =>16 bits = > -32.768 a 32.767
        int =>32 bits = > -2.147 .483 .648 a 2.147 .483 .647
        long =>64 bits = > -9, 223.372 .036 .854 .775 .808 a .9 .223 .372 .036 .854 .775 .807

        //Números Decimais = 1.2, 3.41, 5.623, 5.989893992181738

        float =>32 bits = > precisão simples
        double =>64 bits = > precisão dupla

        //Strings e Caractéres
        String = > representar palavras e frases
        String minhaFrase = "Minha Frase";
        char =>representar um unico caractere =>a, b, c, d
        char meuChar = 'a';
        System.out.printf(minhaFrase);

        */

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Kian";
        boolean bool = true;

        if(str.isBlank()){
            System.out.println("Vazio");
        } else if (str == "Kian"){
            System.out.println("Kian");
        }
        if(bool == false){
            System.out.println("Deu ruim");
        }

    }
}