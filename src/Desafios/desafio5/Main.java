package Desafios.desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente naruto = new ContaCorrente("Naruto Uzumaki", 1000, TipoConta.CORRENTE);
        ContaCorrente sasuke = new ContaCorrente("Sasuke Uchiha" , 5000, TipoConta.CORRENTE);

        naruto.depositar(500);
        naruto.consultarSaldo();

        sasuke.depositar(1500);
        sasuke.consultarSaldo();
        naruto.transferirEntreContas(naruto, sasuke, 500);

        System.out.println("\nPós transferencia!");
        naruto.consultarSaldo();
        sasuke.consultarSaldo();
    }
}
