package Desafios.desafio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ninja naruto = new Ninja();
        Uchiha sasuke = new Uchiha();

        int NUMMAXIMO = 10;
        ArrayList<Ninja> listaDeNinjas = new ArrayList<>();

        int ninjasCadastrados = 0;
        int escolha = 0;

        while (escolha != 3){
            //Menu
            System.out.println("\n\n Bem vindo ao Sistema de cadastro e gerenciamento de ninjas de Konoha!");
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Atualizar habilidades especiais");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    System.out.println("Vamos cadastrar um ninja, escolha o tipo do ninja que irá cadastrar:");
                    System.out.println("1 - Normal");
                    System.out.println("2 - Uchiha");
                    System.out.println("Digite sua opção: ");
                    int opcaoDoTipoDeNinjaParaAdicionar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Nome do Ninja: ");
                    String nomeDoNinjaAdicionado = scanner.nextLine();

                    System.out.println("Idade do Ninja: ");
                    int idadeDoNinjaAdicionado = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Qual é a Missão desse ninja: ");
                    String missaoDoNinjaAdicionado = scanner.nextLine();

                    System.out.println("Qual é o status da missão do ninja: ");
                    String StatusDaMissaoDoNinja = scanner.nextLine();

                    if (opcaoDoTipoDeNinjaParaAdicionar == 1) {
                        Ninja novoNinja = new Ninja();

                        novoNinja.nome = nomeDoNinjaAdicionado;
                        novoNinja.idade = idadeDoNinjaAdicionado;
                        novoNinja.statusMissao = StatusDaMissaoDoNinja;
                        novoNinja.missao = missaoDoNinjaAdicionado;

                        listaDeNinjas.add(novoNinja);
                        System.out.println("Ninja adicionado com Sucesso!!!");
                    } else if (opcaoDoTipoDeNinjaParaAdicionar == 2) {
                        Uchiha novoUchiha = new Uchiha();

                        novoUchiha.nome = nomeDoNinjaAdicionado;
                        novoUchiha.idade = idadeDoNinjaAdicionado;
                        novoUchiha.statusMissao = StatusDaMissaoDoNinja;
                        novoUchiha.missao = missaoDoNinjaAdicionado;
                        System.out.println("Qual é a habilidade especial do ninja: ");
                        String habilidadeUnica = scanner.nextLine();
                        novoUchiha.habilidadeEspecial = habilidadeUnica;

                        listaDeNinjas.add(novoUchiha);
                        System.out.println("Ninja Uchiha adicionado com Sucesso!!!");
                    }
                    break;
                case 2:
                    System.out.println("\n\n LISTA DE NINJAS ABAIXO: \n ");
                    if (listaDeNinjas.isEmpty()){
                        System.out.println("Não há ninjas cadastrados!");
                    }else {
                        for (Ninja ninja : listaDeNinjas){
                            ninja.mostrarInformacoes();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Vamos atualizar o nome do Ninja, primeiro entre com o nome dele: ");
                    String nomeNinjaParaAtualizar =  scanner.nextLine();

                    Ninja nomeNinjaAtualizado = null;

                    for (Ninja ninja : listaDeNinjas){
                        if (ninja.nome.equalsIgnoreCase(nomeNinjaParaAtualizar)){
                            nomeNinjaAtualizado = ninja;
                                    break;
                        }
                    }

                    if(nomeNinjaAtualizado != null){
                        if(nomeNinjaAtualizado instanceof Uchiha){
                            Uchiha uchiha = (Uchiha) nomeNinjaAtualizado;
                            System.out.println("entre com a nova habilidade: ");
                            uchiha.habilidadeEspecial = scanner.nextLine();
                            System.out.println("Habilidade especial atualzada com sucesso!!!");
                            break;
                        }else {
                            System.out.println("O ninja nomeado não é um Uchiha");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Até mais");
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");

            }

        }
        scanner.close();
    }
}
