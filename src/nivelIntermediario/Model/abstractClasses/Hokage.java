package nivelIntermediario.Model.abstractClasses;

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokage(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public abstract void sabedoriahokage();

    public String getNome() {
        return nome;
    }
}
