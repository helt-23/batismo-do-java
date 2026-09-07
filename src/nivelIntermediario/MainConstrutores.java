package nivelIntermediario;

import nivelIntermediario.Model.classes.Senju;

public class MainConstrutores {
    public static void main(String[] args) {
        Senju tobirama = new Senju("Tobirama Senju", 37, true);
        Senju hashirama = new Senju("Hashirama Senju", 35, true);

        tobirama.sabedoriahokage();
        hashirama.sabedoriahokage();
    }
}
