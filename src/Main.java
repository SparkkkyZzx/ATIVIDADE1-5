//ATIVIDADE 2
public class Main {
    public static void main(String[] args) {
        carro meuCarro = new carro();
        meuCarro.marca = "chevrolet";
        meuCarro.modelo = "Chevetão";
        meuCarro.ano = 1973;


        carro outroCarro = new carro();
        outroCarro.marca = "wolkswagen";
        outroCarro.modelo = "Fuscão";
        outroCarro.ano = 1938;


        // Chamando método que só executa ação
        meuCarro.exibir();
        outroCarro.exibir();


        // Chamando método que retorna valor
        System.out.println("Idade do meu carro: " + meuCarro.idadeDoCarro());
        System.out.println("Idade do outro carro: " + outroCarro.idadeDoCarro());
    }


}
