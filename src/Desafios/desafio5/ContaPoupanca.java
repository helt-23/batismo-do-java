package Desafios.desafio5;

public class ContaPoupanca extends ContaBancaria{
    double taxa = 0.02;

    public ContaPoupanca(String nome, double saldo, TipoConta tipoDaConta) {
        super(nome, saldo, tipoDaConta);
    }

    @Override
    public void depositar(double valor) {
        if (saldo == 0){
            System.out.println("Deposito invalido!");
        } else if (saldo < 0){
            System.out.println("Operação inválida, saldo negativo!");
        } else {
            this.saldo = saldo + (valor - valor*taxa);
        }
    }



}
