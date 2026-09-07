package nivelBasico.arrays;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[3];
        int[] idade = new int[3];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";


        idade[0] = 15;
        idade[1] = 17;
        idade[2] = 16;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nome do ninja: " + ninja[i] + " Idade: " + idade[i]);
        }
    }
}
