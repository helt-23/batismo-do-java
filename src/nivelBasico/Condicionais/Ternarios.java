package nivelBasico.Condicionais;

public class Ternarios {
    public static void main(String[] args) {


        /*
        * Maneiras para reduzir código;
        * Variável = (Condição) ? Verdadeiro : Falso
        * */

        short numeroDeMissoes = 1;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões." :
                "Esse ninja tem menos de 10 missões.";
        System.out.println(nivel);

    }
}
