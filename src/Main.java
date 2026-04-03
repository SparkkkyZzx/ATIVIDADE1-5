public class Main {
    public static void main(String[] args) {
        carro c1 = new carro("Fiat", "Uno", 2020);
        carro c2 = c1;
        c2.setModelo("Palio");
        System.out.println(c1.getModelo());
        System.out.println(c2.getModelo());

    }
}
//a) palio e palio
//b) Alterar c2 mudou c1 porque ambos apontam para o mesmo objeto na memória.
//// c1 e c2 não são objetos diferentes, eles são referências para o mesmo objeto.
//// Portanto, qualquer alteração feita por uma referência afeta o mesmo objeto.
//Nao entendi a letra c