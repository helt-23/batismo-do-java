package Desafios.desafio5;

public abstract class ContaBancaria implements Conta{
    String nome;
    double saldo;
    TipoConta tipoDaConta;

        public ContaBancaria(String nome, double saldo, TipoConta tipoDaConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDaConta = tipoDaConta;
    }

    public void consultarSaldo() {
        System.out.println(nome + " seu saldo atual é de: R$ " + saldo);
    }

    public abstract void depositar(double valor);

    @Override
    public void transferencia(double valor) {
        this.saldo = saldo - valor;
    }

    /*TODO: em um futuro com mais tempo, melhorar o funcionamento e hierarquia
     TODO: taxa deveria ir para o banco, sendo assim, ele precisaria ter um "caixa" próprio para receber as taxas e armazenar elas*/
}
