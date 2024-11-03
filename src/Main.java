import ContaBancaria.Conta;
import ContaBancaria.ContaCorrente;
import ContaBancaria.ContaPoupanca;

public class Main
{
    public static void main(String[] args)
    {
        ContaCorrente conta = new ContaCorrente(1213, "Willian");

        conta.deposito(200);
        conta.saque(100.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca(123, "Talita");

        contaPoupanca.deposito(200);
        contaPoupanca.saque(100.0);
        contaPoupanca.rendimento();
    }
}
