public class carro {

    private String marca;
    private String modelo;
    private int ano;

    public static int totalCarros = 0;

    public carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;

        if (ano < 1886 || ano > 2026) {
            System.out.println("Ano inválido!");
            this.ano = 0;
        } else {
            this.ano = ano;
        }

        totalCarros++;
    }

    public carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;

        totalCarros++; // incrementa contador
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }

    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------------");
    }
}