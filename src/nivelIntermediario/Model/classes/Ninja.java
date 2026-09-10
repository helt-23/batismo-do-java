package nivelIntermediario.Model.classes;

import nivelIntermediario.Interface.EstrategiaDeBatalha;
import nivelIntermediario.enums.NivelNinja;

public abstract class Ninja implements EstrategiaDeBatalha {
    private String nome;
    private int idade;
    private String aldeia;
    private int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public final void tacarKunai(){
        System.out.println("metodo da classe mãe!");
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
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
