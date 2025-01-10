package exercise_bonus;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;
    private Notificador notificador;

    public ContaBancaria(String titular, Notificador notificador) {
        ValidadorDeDados.validarTitular(titular);
        this.titular = titular;
        this.saldo = 0.0;
        this.notificador = notificador;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        ValidadorDeDados.validarValorPositivo(valor);
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
    }

    public void sacar(double valor) {
        ValidadorDeDados.validarValorPositivo(valor);
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
    }

    public abstract void aplicarTaxas();


}