package nivelIntermediario.Model.classes;

import nivelIntermediario.Interface.EstrategiaDeBatalha;
import nivelIntermediario.enums.NivelNinja;

public abstract class Ninja implements EstrategiaDeBatalha {
    public String nome;
    public int idade;
    public String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    //TODO: Incluir 2 novos atributos : numeroDeMissoesConcluidas, rank
    //TODO: rank: Gennin, chunnin, jounnin, Hokage

    public Ninja() {
    }

    // TODO NINJA VAI FAZER OBRIGATORIAMENTE
    // todo metodo final não pode ser reescrito
    public final void tacarKunai(){
        System.out.println("metodo da classe mãe!");
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //TODO: sobrecarga do construtor chamando os novos atributos.
    //sobrecarga de metodos não precisa redeclarar o construtor, só os novos atributos.
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    //Sobrecarga de metodo
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha inteligencia de batalha ninja");
    }

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            System.out.println("Seu Qi é " +qi + " e você é um gênio!");
        } else if (qi >= 130){
            System.out.println("Seu Qi é " +qi + " e você é um ninja promissor!");
        } else{
            System.out.println("Seu Qi é " +qi + " e você é precisa treinar mais!");
        }
    }

    @Override
    public void EstrategiaDeBatalha() {
        System.out.println("Meu nome é " + nome + " e essa é minha estratégia de batalha ninja");
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }


    @Override
    public String toString() {
        return "Meu nome é " + nome + ", eu sou da aldeia "+ aldeia + " e eu tenho " + idade + " anos.";
    }
}
