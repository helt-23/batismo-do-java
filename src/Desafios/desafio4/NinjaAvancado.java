package Desafios.desafio4;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    TipoHabilidade habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String especialidade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.habilidade = habilidade;
    }

    enum TipoHabilidade{
        TAIJUTSU, NINJUTSU, GENJUTSU, KATON, RINNENGAN;
    }

    @Override
    public void mostrarinformacoes() {
        System.out.println("Informações do Ninja:");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Habilidade:" + habilidade);
        System.out.println("Especialidade:" + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("O ninja " + nome + " e usou o " + habilidade);
    }
}
