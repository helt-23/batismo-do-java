package nivelIntermediario.Model.classes;

import nivelIntermediario.Interface.SharinganInterface;
import nivelIntermediario.enums.NivelNinja;

public class Uchiha extends Ninja implements SharinganInterface {
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public Uchiha(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    public void SharinganAtivado(){
        System.out.println("Sharingan ativou!");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha inteligencia de batalha ninja");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu Qi é " +qi + " e você é um gênio!");
        } else if (qi >= 130){
            System.out.println("Seu Qi é " +qi + " e você é um ninja promissor!");
        } else{
            System.out.println("Seu Qi é " +qi + " e você é precisa treinar mais!");
        }
    }
}
