public class Main {
    public static void main(String[] args) {

        carro c1 = new carro("Chevrolet", "Chevetão", 1973);
        carro c2 = new carro("Volkswagen", "Fusca", 1980);
        carro c3 = new carro("Ford", "Mustang", 1965);
        carro c4 = new carro("Fiat","uno", 2010);
        carro c5 = new carro("honda ","civiczão", 1985);

        System.out.println("Total de carros criados: " + carro.totalCarros);
    }
}
// Acessamos com Carro.totalCarros porque é um atributo static (da classe),
// ou seja, pertence à classe e não a um objeto específico.

// Atributo static: compartilhado por todos os objetos.
// Atributo de instância: cada objeto tem seu próprio valor.