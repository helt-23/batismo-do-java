package Desafios.desafio5;

public class ContaCorrente extends ContaBancaria{
double taxa = 0.01;

    public ContaCorrente(String nome, double saldo, TipoConta tipoDaConta){
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
            System.out.println("Deposito concluído com sucesso!");
        }
    }

    public void transferirEntreContas(ContaCorrente envio, ContaCorrente destino, double transferencia) {
        if (destino != null && envio != null){
            destino.depositar(transferencia);
            envio.transferencia(transferencia);
        }
    }
}
