package nivelIntermediario.enums;

public enum RankDeMissoes {

    D("Baixo", 2),
    C("Confortável", 2),
    B("Moderado", 2),
    A("Dificil", 2),
    S("Altissimo", 2),;

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
