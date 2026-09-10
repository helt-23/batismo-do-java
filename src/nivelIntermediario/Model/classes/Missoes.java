package nivelIntermediario.Model.classes;

import nivelIntermediario.enums.RankDeMissoes;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + " Rank: " + rank);
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }
}
