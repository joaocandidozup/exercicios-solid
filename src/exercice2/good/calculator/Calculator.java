package exercice2.good.calculator;

import exercice2.good.operation.Operation;

public class Calculator {
    public int calculate(int a, int b, Operation operation){
        return operation.calculate(a,b);
    }
}
