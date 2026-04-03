public class Main {
    public static void main(String[] args) {

        carro c1 = new carro("Chevrolet", "Chevetão", 1973);
        carro c2 = new carro("Volkswagen", "Fusca", 1980);

        c1.exibir();
        c2.exibir();

        // método static
        carro.imprimirTotal();

        // tentativa de alterar constante (vai dar erro)
        // Carro.ANO_PRIMEIRO_CARRO = 1900;
        // Não é possível alterar o valor porque a variável é final,
        // ou seja, constante e não pode ser modificada após definida.
    }
}