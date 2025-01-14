import java.util.Scanner;

public class Pricnipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();


        conta.setNumeroConta(123);
        conta.setSaldo(2000);
        conta.titular = "George";

        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular " + conta.titular);


        System.out.println("Digite o valor que deseja sacar: ");
        double valorSaque = scanner.nextDouble();

        conta.sacar((valorSaque));
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());


        scanner.close();
    }
}