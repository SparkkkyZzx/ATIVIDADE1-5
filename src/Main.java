public static void main(String[] args) {
    int x;
    if (true) {
        x = 10;
    }
    System.out.println(x);
}

// Escopo é a região do código que a variável pode ser acessada.
// A variável "x" foi criada dentro do bloco if, então só existe dentro dele.
// Fora do if, ela não existe, por isso ocorre erro ao tentar acessá-la.
//O codigo foi corrigido