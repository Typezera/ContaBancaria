package ContaBancaria;

public abstract class Conta
{
    protected int _numeroConta;
    protected double _saldo;
    protected String _donoDaConta;

    protected abstract void saque(double saque);

    protected abstract void deposito(double val);

}
