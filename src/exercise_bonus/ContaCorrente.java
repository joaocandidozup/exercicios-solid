package exercise_bonus;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String titular, double taxaManutencao,Notificador emailNotificador) {
        super(titular,emailNotificador);
        ValidadorDeDados.validarTaxa(taxaManutencao,"manutenção");
        this.taxaManutencao = taxaManutencao;
    }

    public void aplicarTaxas() {
        if (getSaldo() < taxaManutencao) {
            throw new IllegalArgumentException("Saldo insuficiente para aplicar a taxa de manutenção.");
        }
        double saldoAtualizado = getSaldo()-taxaManutencao;
        setSaldo(saldoAtualizado);
        System.out.println("Taxa de manutenção aplicada: " + taxaManutencao + ". Novo saldo: " + getSaldo());
    }


}