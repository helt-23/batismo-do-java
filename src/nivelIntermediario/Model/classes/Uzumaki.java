package nivelIntermediario.Model.classes;

public class Uzumaki extends Ninja {
    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    public void modoSabioAtivado() {
        System.out.println("Meu nome é " + nome + " e eu ativei o modo Sábio.");
    }

}
