package nivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: criar um ninja e atribuir um método a ele.
        * */

        String nome = "Naruto Uzumaki";

        String nomeUpperCase = nome.toUpperCase(); //toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Nome em CAPSLOCK: " +   nomeUpperCase);
        System.out.println(nome);

    }
}
