public class carro {

    private String marca;
    private String modelo;
    private int ano;

    public static final int ANO_PRIMEIRO_CARRO = 1886;


    public static int totalCarros = 0;

    public static void imprimirTotal() {
        System.out.println("Total de carros: " + totalCarros);
    }

    public void setAno(int ano) {
        if (ano < ANO_PRIMEIRO_CARRO || ano > 2026) {
            System.out.println("Ano inválido!");
        } else {
            this.ano = ano;
        }
    }

    public carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        setAno(ano);
        totalCarros++;
    }

    public carro() {
        this.marca = "Desconhecido";
        this.modelo = "Desconhecido";
        this.ano = 0;
        totalCarros++;
    }

    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------------");
    }

    public int idadeDoCarro() {
        return 2026 - ano;
    }
}