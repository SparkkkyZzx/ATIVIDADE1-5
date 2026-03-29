//att 4

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<carro> listaDeCarros = new ArrayList<>();
        carro meuCarro = new carro();
        meuCarro.setMarca("Chevrolet");
        meuCarro.setModelo("Chevetão");
        meuCarro.setAno(1973);

        carro outroCarro = new carro();
        outroCarro.setMarca("Volkswagen");
        outroCarro.setModelo("Fuscão");
        outroCarro.setAno(1938);

        carro terceiroCarro = new carro();
        terceiroCarro.setMarca("Ford");
        terceiroCarro.setModelo("Mustang");
        terceiroCarro.setAno(1965);

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