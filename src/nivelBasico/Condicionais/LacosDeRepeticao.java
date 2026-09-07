package nivelBasico.Condicionais;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while(numeroDeClones <= numeroMaximoDeClones){
            System.out.println("O naruto fez um numero de clones das sombras. Clone: " + numeroDeClones);
            numeroDeClones++;
        }

        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez um numero de clones das sombras. Clone: " + i);
        }
    }
}
