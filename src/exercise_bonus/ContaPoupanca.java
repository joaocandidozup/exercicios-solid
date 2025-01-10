package exercise_bonus;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double taxaRendimento,Notificador emailNotificador) {
        super(titular, emailNotificador);
        ValidadorDeDados.validarTaxa(taxaRendimento,"rendimento");
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarTaxas() {
        double rendimento = getSaldo() * (taxaRendimento / 100);
        double saldoAtualizado = getSaldo()+rendimento;
        setSaldo(saldoAtualizado);
        System.out.println("Rendimento aplicado: " + rendimento + ". Novo saldo: " + getSaldo());
    }


}