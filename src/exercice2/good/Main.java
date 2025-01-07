package exercice2.good;

import exercice2.good.calculator.Calculator;
import exercice2.good.operation.Multiplication;
import exercice2.good.operation.Subtraction;
import exercice2.good.operation.Sum;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 4;


        System.out.println("soma de " + a + " + " + b + " = " + calculator.calculate(a, b, new Sum()));
        System.out.println("subtração de " + a + " - " + b + " = " + calculator.calculate(a, b, new Subtraction()));
        System.out.println("multiplicação de " + a + " X " + b + " = " + calculator.calculate(a, b, new Multiplication()));

    }
}