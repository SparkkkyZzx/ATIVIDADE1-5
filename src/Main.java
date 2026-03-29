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


        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);


        System.out.println("Marca: " + outroCarro.marca);
        System.out.println("Modelo: " + outroCarro.modelo);
        System.out.println("Ano: " + outroCarro.ano);
    }
}



