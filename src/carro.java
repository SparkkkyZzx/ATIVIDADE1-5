public class carro {

    private String marca;
    private String modelo;
    private int ano;

    public static int totalCarros = 0;

    public carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        totalCarros++;
    }

    public carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public static void imprimirTotal() {
        System.out.println("Total de carros: " + totalCarros);

        // tentativa de acessar atributo de instância
        // ERRO!
    }
}