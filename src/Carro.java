public class Carro {

    // Atributos da classe Carro.
    // Cada objeto (instância) tera o seu próprio modelo e cor.
    private String modelo;
    private String cor;

    // Construtor da classe Carro.
    // É chamado automaticamente quando você usa "new Carro(...)".
    public Carro(String modelo, String cor) {
        this.modelo = modelo;  // "this" diferencia o atributo do parâmetro
        this.cor = cor;
    }

    // Metodo que representa uma ação do carro.
    // Ele imprime que o carro acelerando e retorna a cor do carro.
    public String acelerar() {
        System.out.println(this.modelo + " Acelerando");
        return this.cor;
    }

    // Getters — usados para acessar atributos privados.
    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    // Setters — usados para alterar atributos privados.
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Metodo sobrescrito para exibir o objeto de forma amigável.
    @Override
    public String toString() {
        return "Carro{modelo='" + modelo + "', cor='" + cor + "'}";
    }
}
