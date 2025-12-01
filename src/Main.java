public class Main {
    public static void main(String[] args) {

        // Criando duas instâncias (objetos) da classe Carro.
        // Cada "new Carro(...)" cria um objeto novo na memória.
        Carro meuCarro = new Carro("Fusca", "Azul");
        Carro meuCarro2 = new Carro("Brasilia", "Amarela");

        // Acessando as informações com getters (boa prática).
        System.out.println(meuCarro.getModelo() + " " + meuCarro.getCor());
        System.out.println(meuCarro2.getModelo());

        // Chamando o metodo acelerar.
        meuCarro.acelerar();
        meuCarro2.acelerar();

        // Armazenando o retorno do metodo acelerar.
        String result = meuCarro2.acelerar();
        System.out.println(result);

        // Usando o metodo toString sobrescrito.
        System.out.println(meuCarro);

        // Usando metodo setter
        meuCarro.setModelo("Opala");
        meuCarro.setCor("Preto");
        System.out.println(meuCarro);
    }
}

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

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Kian";
        boolean bool = true;

        // Condicional If Else Else If
        if(str.isBlank()){
            System.out.println("Vazio");
        } else if (str == "Kian"){
            System.out.println("Kian");
        }
        if(bool == false){
            System.out.println("Deu ruim");
        }

        // Vetor com Valor Fixo
        int[] colecaoDeInteiro = {1, 2, 3, 4, 5};
        int[] meusNumeros = new int[5];
        meusNumeros[0] = 1;
        System.out.println(colecaoDeInteiro.length);
        System.out.println(colecaoDeInteiro[0]);
        System.out.println(meusNumeros[0]);

        String[] nomesArr = new String[10];

        nomesArr[0] = "Fernanda";
        nomesArr[1] = "Kian";
        nomesArr[2] = "João";
        nomesArr[4] = "Maria";
        nomesArr[5] = "Guilherme";
        nomesArr[6] = "Matheus";
        nomesArr[7] = "Felipe";
        nomesArr[8] = "Rio";
        nomesArr[9] = "Samba";

        // Sytstem.out.println(nomesArr[0];

        // ArrayList & Vetores
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Array");
        nomes.add("List");
        nomes.add("Nomes");
        nomes.add("Teste");
        // System.out.println(nomes.get(0));

        //nomes.remove(4);
        nomes.remove("Leo");

        // System.out.println(nomes.get(0));

        for (int meuIterador = 0; meuIterador < nomesArr.length; meuIterador++) {
            System.out.println(nomesArr[meuIterador]);
        }

        for (int meuIterador = 0; meuIterador < nomes.size(); meuIterador++) {
            System.out.println(nomes.get(meuIterador));
        }

        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (String nome : nomesArr){
            System.out.println(nome);
        }

        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        //Casting explícito
        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        //Casting implícito
        int meuInt = 10;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        System.out.println(meuInt2);

         */
