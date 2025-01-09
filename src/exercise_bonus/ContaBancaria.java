package exercise_bonus;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;
    private INotificador notificador;

    public ContaBancaria(String titular, INotificador notificador) {
        validarTitular(titular);
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial é zero
        this.notificador = notificador;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        validarTitular(titular);
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected INotificador getNotificador() {
        return notificador;
    }

    public void depositar(double valor) {
        validarValorPositivo(valor);
        saldo += valor;
        notificador.enviarNotificacao("Depósito realizado com sucesso. Novo saldo: " + saldo);
    }

    public void sacar(double valor) {
        validarValorPositivo(valor);
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
        notificador.enviarNotificacao("Saque realizado com sucesso. Novo saldo: " + saldo);
    }

    private void validarTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular não pode ser vazio.");
        }
    }

    private void validarValorPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
    }


    public void aplicarTaxas() {

    }
}