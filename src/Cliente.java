public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente(String nome) {
        this.nome = nome;
        this.cpf = "000.000.000-00";
    }

    public void exibir() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
    }
}