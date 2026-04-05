import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
    }

    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }

        for (int i = 0; i < itens.size(); i++) {
            System.out.println(i + " - " + itens.get(i).getNome());
        }
    }

    public void editar(int index, String novoNome) {
        if (index >= 0 && index < itens.size()) {
            itens.get(index).setNome(novoNome);
        }
    }

    public void remover(int index) {
        if (index >= 0 && index < itens.size()) {
            itens.remove(index);
        }
    }
}