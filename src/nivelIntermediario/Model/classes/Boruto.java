package nivelIntermediario.Model.classes;

import nivelIntermediario.Interface.HyugaUzumaki;

public class Boruto extends Uzumaki implements HyugaUzumaki {

    @Override
    public void ativarOkarma() {
        System.out.println("Karma ativado!");
    }

    @Override
    public void ativarByakugan() {
        System.out.println("Byakugan ativado!");
    }
}
