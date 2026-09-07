package Desafios.desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NUMMAXIMO = 10;
        String[] ninjas = new String[NUMMAXIMO];

        int ninjasCadastrados = 0;
        int escolha = 0;

        while (escolha != 3){
            //Menu
            System.out.println("\n\n Bem vindo ao Sistema de cadastro e gerenciamento de ninjas de Konoha!");
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Vamos cadastrar um ninja, entre com as informações do ninja:");

                    if (ninjasCadastrados < NUMMAXIMO){
                        System.out.println("Nome: ");
                        ninjas[ninjasCadastrados] = scanner.nextLine();
                        ninjasCadastrados++;
                    }
                    else {
                        System.out.println("Não pode mais cadastrar ninjas.");
                    }
                    break;
                case 2:
                    System.out.println("\n\n LISTA DE NINJAS ABAIXO: \n ");
                    for (int i = 0; i < ninjasCadastrados; i++) {
                        System.out.println("Nome: " + ninjas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Até mais");
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");

            }

        }
        scanner.close();
    }
}
