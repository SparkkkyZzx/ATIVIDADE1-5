public class Main {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            int y = 20;
            System.out.println("x dentro do if: " + x);
            System.out.println("y dentro do if: " + y);
        }

        System.out.println("x fora do if: " + x);
        // System.out.println(y);
    }
}
// Alterar b não muda a, porque tipos primitivos são passados por valor.
// Isso significa que b recebe uma cópia do valor de a.
// Quando b muda, apenas essa cópia muda, e o valor original de a fica a msm coisa .