package desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("Informações do Ninja:");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Habilidade:" + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + nome + " e lançou um ataque com " + habilidade);
    }
}
