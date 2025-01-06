package exercice2.bad;

public class Calculator {
    public int calculate(int a,int b,String operation){
        if(operation.equals("sum")){
            return a + b;
        } else if (operation.equals("subtraction")) {
            return a -b;
            
        }
        return 0;
    }
}
