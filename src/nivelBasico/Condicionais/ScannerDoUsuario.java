package nivelBasico.Condicionais;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o nome do Ninja: ");
        String nomeDoNinja = scanner.nextLine();
        System.out.println("Escreva a idade do ninja: ");
        int idade = scanner.nextInt();

        System.out.println("-----------------------------------");
        System.out.println( "O nome do ninja é " +nomeDoNinja);
        System.out.println( "A idade do ninja é " + idade);
        if (idade >= 18) {
            System.out.println("Esse ninja é maior de idade e pode ir para missões.");
        }
        else {
            System.out.println("Esse ninja é muito novo e não pode sair em missões.");
        }

        //fechar sempre o escaner
        scanner.close();

    }
}
