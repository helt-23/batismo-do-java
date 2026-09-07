package desafio4;

public class Main {
    public static void main(String[] args) {
        NinjaAvancado hokage = new NinjaAvancado("Hashirama Senju", 37, "Mokuton", NinjaAvancado.TipoHabilidade.NINJUTSU);
        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", 16, "Rasengan");

        naruto.mostrarinformacoes();
        naruto.executarHabilidade();
        System.out.println();
        hokage.mostrarinformacoes();
        hokage.executarHabilidade();
    }
}
