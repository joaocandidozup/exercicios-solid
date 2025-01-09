package exercise_bonus;

import java.util.Scanner;

public class MenuBanco {
    public static void inicio(){
        Scanner scanner = new Scanner(System.in);
        INotificador notificador = new Notificador();
        ContaBancaria conta = null;

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        if (tipoConta == 1) {
            System.out.print("Digite a taxa de manutenção: ");
            double taxaManutencao = scanner.nextDouble();
            conta = new ContaCorrente(titular, taxaManutencao, notificador);
        } else if (tipoConta == 2) {
            System.out.print("Digite a taxa de rendimento (%): ");
            double taxaRendimento = scanner.nextDouble();
            conta = new ContaPoupanca(titular, taxaRendimento, notificador);
        } else {
            System.out.println("Opção inválida.");
            System.exit(0);
        }
        int opcao = 0;
        while (opcao !=5) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Aplicar Taxas");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    try {
                        conta.sacar(valorSaque);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        conta.aplicarTaxas();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 5:
                    System.out.println("Obrigado por usar o sistema bancário!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
