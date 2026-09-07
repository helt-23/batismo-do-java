package nivelIntermediario;

import nivelIntermediario.Model.classes.*;
import nivelIntermediario.enums.NivelNinja;

public class Main {
    public static void main(String[] args) {

        //Criar ninjas
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", 16, "Aldeia da Folha");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", 17, "Aldeia da folha");

        System.out.println("\n================ Sasuke ================");
        System.out.println(sasuke.nome);


        System.out.println("\n================ Naruto ================");
        System.out.println(naruto.nome);
        System.out.println(naruto);
    }
}
