package polimorphysm.overload;

class Sum {
    void soma(int a) {
        System.out.println(a + a);
    }

    void soma(Double a) {
        System.out.println(a  + a);
    }

    void soma(int a, int b) {
        System.out.println(a + b);
    }

    void soma(Double a, Double b) {
        System.out.println(a + b);
    }
}

public class Calculator {
    
    public static void main(String[] args) throws Exception {

        Sum sum = new Sum();

        sum.soma(5);
        sum.soma(5.5);
        sum.soma(7,5);
        sum.soma(2.2, 10.2);
    }
}
