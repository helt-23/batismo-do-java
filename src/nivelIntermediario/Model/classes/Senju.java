package nivelIntermediario.Model.classes;

import nivelIntermediario.Model.abstractClasses.Hokage;

public class Senju extends Hokage {

    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    @Override
    public void sabedoriahokage() {
        System.out.println(getNome() + " Recebeu a sabedoria!");
    }


}
