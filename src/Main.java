//ATT 3


import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {


        ArrayList<carro> listaCarros = new ArrayList<>();
        carro carro1 = new carro();
        carro1.marca = "chevrolet";
        carro1.modelo = "Chevetão";
        carro1.ano = 1973;


        carro carro2 = new carro();
        carro2.marca = "wolkswagen";
        carro2.modelo = "Fuscão";
        carro2.ano = 1938;


        carro carro3 = new carro();
        carro3.marca = "ford";
        carro3.modelo = "Mustang";
        carro3.ano = 2020;


        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);


        for (carro c : listaCarros) {
            c.exibir();
            System.out.println("-------------------");
        }
    }
}
