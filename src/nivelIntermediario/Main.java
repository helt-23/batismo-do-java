package nivelIntermediario;

import nivelIntermediario.Model.classes.*;
import nivelIntermediario.enums.NivelNinja;
import nivelIntermediario.enums.RankDeMissoes;

public class Main {
    public static void main(String[] args) {

        //Criar ninjas
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 16, "Aldeia da Folha");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 17, "Aldeia da folha");

        System.out.println("\n================ Sasuke ================");
        System.out.println(sasuke.getNome());

        //objeto missao
        Missoes missao = new Missoes("Resgatar cachorro", RankDeMissoes.C);
        missao.exibirDetalhes();

        System.out.println("\n================ Naruto ================");
        naruto.tacarKunai();
        System.out.println(naruto.getNome());
        System.out.println(naruto);
    }
}
