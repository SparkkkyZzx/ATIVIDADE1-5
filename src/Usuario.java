public class Usuario {
    private String usuario;
    private String senha;

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public boolean autenticar(String u, String s) {
        return this.usuario.equals(u) && this.senha.equals(s);
    }
}