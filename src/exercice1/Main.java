package exercice1;

import exercice1.good.FinancialReport;
import exercice1.good.service.EmailService;

public class Main {
    public static void main(String[] args) {
        //gerando relatorio
        FinancialReport report = new FinancialReport();
        report.generateReport();

        //enviando email
        EmailService email = new EmailService();
        email.sendByEmail();
    }
}