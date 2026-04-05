import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n1 - Cadastrar Nome");
            System.out.println("2 - Listar Nomes");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                nomes.add(nome);
            } else if (opcao == 2) {
                System.out.println("--- Lista de Nomes ---");
                for (String n : nomes) {
                    System.out.println(n);
                }
            }
        }
        scanner.close();
    }
}

// so pra dar certo
