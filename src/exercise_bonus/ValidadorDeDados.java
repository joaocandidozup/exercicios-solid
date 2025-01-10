package exercise_bonus;

public class ValidadorDeDados {
    public static void validarTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular não pode ser vazio.");
        }
    }

    public static void validarValorPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
    }

    public static void validarTaxa(double taxa,String tipoDaTaxa) {
        if (taxa < 0) {
            throw new IllegalArgumentException("A taxa de "+tipoDaTaxa+" não pode ser negativa.");
        }
    }

}