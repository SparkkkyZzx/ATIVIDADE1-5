public class Main {
    public static void main(String[] args) {

        carro meuCarro = new carro("VW", "Gol", 2015);

        trocarModelo(meuCarro);

        System.out.println(meuCarro.getModelo());
    }

    public static void trocarModelo(carro c) {
        c.setModelo("Fusca");
    }
}
// fusca
//// A mudança feita dentro do método trocarModelo afetou o objeto original
//// porque estamos passando uma referência ao objeto, e não uma cópia.
//// O parâmetro c aponta para o mesmo objeto que meuCarro.
//// Portanto, ao alterar c, estamos modificando o mesmo objeto na memória.

//STACK:
//meuCarro ─┐
//          ├──→ HEAP: Carro ("Fusca")
//c ────────┘