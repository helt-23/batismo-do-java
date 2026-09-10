package nivelIntermediario.Model.classes;

import nivelIntermediario.Interface.AnbuInterface;
import nivelIntermediario.Interface.SharinganInterface;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public Hatake() {
    }

    public Hatake(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void boasVindas(){
        System.out.println(getNome() + " : eu sou um hatake");
    }

    public void SharinganAtivado(){
        System.out.println(getNome() + " Ativou o sharingan do Obito!");
    }

    public void ninjaDeElite() {
        System.out.println("Eu sou um ninja de Elite da anbu!");
    }
}
