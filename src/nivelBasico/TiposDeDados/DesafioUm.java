package nivelBasico.TiposDeDados;

public class DesafioUm {
    public static void main(String[] args) {
        int idade = 15;
        String nome = "Naruto";
        String nomeDaMissao = "missão para impedir o naruto de subir de Nível.";
        int dificuldadeMissao = 1;

        int idade2 = 14;
        String nome2 = "Sakura";
        String nomeDaMissao2 = "Teste tsunade";
        int dificuldadeMissao2 = 3;

        int idade3 = 35;
        String nome3 = "Kakashi";
        String nomeDaMissao3 = "invasão Orochimaru";
        int dificuldadeMissao3 = 3;

        System.out.println("-----------------------------");
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Nome da missão do ninja: " + nomeDaMissao);
        System.out.println("Dificuldade da missão do ninja: " + dificuldadeMissao);
        if(idade < 15 && dificuldadeMissao > 2){
            System.out.println("Missão não concluída.");
        }
        else{
            System.out.println("Missão concluída.");
        }
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("Nome do ninja: " + nome2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Nome da missão do ninja: " + nomeDaMissao2);
        System.out.println("Dificuldade da missão do ninja: " + dificuldadeMissao2);
        if(idade2 < 15 && dificuldadeMissao2 > 2){
            System.out.println("Missão não concluída.");
        }
        else{
            System.out.println("Missão concluída.");
        }
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("Nome do ninja: " + nome3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Nome da missão do ninja: " + nomeDaMissao3);
        System.out.println("Dificuldade da missão do ninja: " + dificuldadeMissao3);
        if(idade3 < 15 && dificuldadeMissao3 > 2){
            System.out.println("Missão não concluída.");
        }
        else{
            System.out.println("Missão concluída.");
        }
        System.out.println("-----------------------------");
    }
}
