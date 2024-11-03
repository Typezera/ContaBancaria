package ContaBancaria;

public class ContaCorrente extends Conta
{
    private final double _taxa = 0.05;


    public ContaCorrente(int num, String donoConta)
    {
        this._numeroConta = num;
        this._donoDaConta = donoConta;
        this._saldo = 0;
    }

    @Override
    public void saque(double saque)
    {
        double tax = _taxa * saque;
        double valorFinal = saque + tax;

        if(saque != 0 && valorFinal < _saldo)
        {
            _saldo -= valorFinal;
            System.out.println("Saque de " + saque + " realizado com sucesso");
            System.out.println("Taxa cobrada pelos serviços: " + tax);
            System.out.printf("Seu saldo atual: " +  _saldo);
            return;
        }
        System.out.println("Informe um valor valido.");
    }

    @Override
    public void deposito(double val)
    {
        if(val > 0)
        {
            _saldo += val;
            System.out.println("Deposito de " + val + " feito com sucesso.");
            return;
        }
        System.out.println("O valor: " + val + " é invalido.");
    }
}
