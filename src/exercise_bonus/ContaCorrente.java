package exercise_bonus;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String titular, double taxaManutencao, INotificador notificador) {
        super(titular, notificador);
        validarTaxa(taxaManutencao);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        validarTaxa(taxaManutencao);
        this.taxaManutencao = taxaManutencao;
    }


    public void aplicarTaxas() {
        if (getSaldo() < taxaManutencao) {
            throw new IllegalArgumentException("Saldo insuficiente para aplicar a taxa de manutenção.");
        }
        sacar(taxaManutencao);
        getNotificador().enviarNotificacao("Taxa de manutenção aplicada: " + taxaManutencao + ". Novo saldo: " + getSaldo());
    }



    private void validarTaxa(double taxa) {
        if (taxa < 0) {
            throw new IllegalArgumentException("A taxa de manutenção não pode ser negativa.");
        }
    }
}