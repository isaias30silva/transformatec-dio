public class ArithmeticExceptionExample {
    
    static void division(int a, int b) throws ArithmeticException {

        if(b == 0) {

            throw new ArithmeticException("Divisão por zero");
        }

        int c = a/b;

        System.out.println(c);
    }

    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;

        division(a,b);
    }
}
