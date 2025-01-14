import java.util.Scanner;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titular;

    public  int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {

        this.numeroConta = numeroConta;
    }

    public  double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;

    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + "Saque Realizado com sucesso");
        } else if (valor <= 0) {
            System.out.println("O valor do saque deve ser maior que zero");
        } else {
            System.out.println("Saldo insuficiente para realizar saque.");
        }
    }

}