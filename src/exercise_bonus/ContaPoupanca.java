package exercise_bonus;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double taxaRendimento, INotificador notificador) {
        super(titular, notificador);
        validarTaxa(taxaRendimento);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        validarTaxa(taxaRendimento);
        this.taxaRendimento = taxaRendimento;
    }


    public void aplicarTaxas() {
        double rendimento = getSaldo() * (taxaRendimento / 100);
        depositar(rendimento);
        getNotificador().enviarNotificacao("Rendimento aplicado: " + rendimento + ". Novo saldo: " + getSaldo());
    }

    private void validarTaxa(double taxa) {
        if (taxa < 0) {
            throw new IllegalArgumentException("A taxa de rendimento não pode ser negativa.");
        }
    }
}