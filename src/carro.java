public class carro {
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1886 || ano > 2026) {
            System.out.println("Ano inválido para um carro. O primeiro carro foi inventado em 1886.");
            return;
        }
        this.ano=ano;

    }

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private int ano;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    private int idade = 2026 - ano;


    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("--------------------------");
    }

    public int idadeDocarro() {
        return 2026 - ano;
    }
}
