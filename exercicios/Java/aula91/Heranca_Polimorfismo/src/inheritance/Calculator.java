package inheritance;

interface sum {
    public void sumNumber(Double a, Double b);
}

interface sub {
    public void subNumbers(Double a, Double b);
}

interface calculable extends sum, sub {
    public void calculable();
}

public class Calculator implements calculable {

    @Override
    public void sumNumber(Double a, Double b) {
        System.out.println(a + b);  
    }

    @Override
    public void subNumbers(Double a, Double b) {
        System.out.println(a - b);   
    }

    @Override
    public void calculable() {
        System.out.println("Calculadora");  
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculable();
        calculator.subNumbers(2.2, 8.0);
        calculator.sumNumber(2.2, 8.0);
    }

}