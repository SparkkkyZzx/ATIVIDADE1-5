public class carro {
    String marca;
    String modelo;
    int ano;


    // a) Método que apenas executa uma ação (não retorna valor)
    void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }


    // b) Método que devolve um valor
    int idadeDoCarro() {
        return 2026 - ano;
    }


}
