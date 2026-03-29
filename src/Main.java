//att 5
//a vantagem do construtor é pode r criar o objeto já com os atributos definidos, sem precisar usar os métodos set para cada atributo, tornando o código mais limpo e eficiente. Além disso, o construtor garante que o objeto seja criado em um estado válido, evitando a possibilidade de esquecer de definir algum atributo importante.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<carro> listaDeCarros = new ArrayList<>();


        carro meuCarro = new carro("Chevrolet", "Chevetão", 1973);
        carro outroCarro = new carro("Volkswagen", "Fuscão", 1938);
        carro terceiroCarro = new carro("Ford", "Mustang", 1965);

        listaDeCarros.add(meuCarro);
        listaDeCarros.add(outroCarro);
        listaDeCarros.add(terceiroCarro);

        for (carro c : listaDeCarros) {
            c.exibir();
        }

        int idade1 = meuCarro.idadeDocarro();
        int idade2 = outroCarro.idadeDocarro();
        int idade3 = terceiroCarro.idadeDocarro();

        System.out.println("Idade do meu carro: " + idade1 + " anos");
        System.out.println("Idade do outro carro: " + idade2 + " anos");
        System.out.println("Idade do terceiro carro: " + idade3 + " anos");
    }
}