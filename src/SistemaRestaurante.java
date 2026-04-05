import java.util.Scanner;

public class SistemaRestaurante {

    private static final String[] CARDAPIO = {
            "Cachorro-Quente",
            "Sushi",
            "Pizza",
            "Baguncinha"
    };

    private static final Usuario usuario = new Usuario("Miguellindo", "160810");

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Login:");
            System.out.print("Usuário: ");
            String u = sc.nextLine();

            if (u.equals("0")) return;

            System.out.print("Senha: ");
            String s = sc.nextLine();

            if (usuario.autenticar(u, s)) {
                break;
            } else {
                System.out.println("Credenciais inválidas!\n");
            }
        }

        Carrinho carrinho = new Carrinho();

        while (true) {
            System.out.println("\n1 - Incluir");
            System.out.println("2 - Consultar");
            System.out.println("3 - Editar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    mostrarCardapio();
                    int escolha = sc.nextInt();
                    sc.nextLine();

                    if (escolha >= 0 && escolha < CARDAPIO.length) {
                        carrinho.adicionar(new Item(CARDAPIO[escolha]));
                    }
                    break;

                case 2:
                    carrinho.listar();
                    break;

                case 3:
                    carrinho.listar();
                    System.out.print("Index: ");
                    int idx = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Novo nome: ");
                    String novo = sc.nextLine();

                    carrinho.editar(idx, novo);
                    break;

                case 4:
                    carrinho.listar();
                    System.out.print("Index: ");
                    int rem = sc.nextInt();
                    carrinho.remover(rem);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;
            }
        }
    }

    private static void mostrarCardapio() {
        System.out.println("\nCardápio:");
        for (int i = 0; i < CARDAPIO.length; i++) {
            System.out.println(i + " - " + CARDAPIO[i]);
        }
    }
}