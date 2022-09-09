package lambdas;

interface Calculator{

    //método abstrato não tem corpo
    int calc(int a, int b);

    //método concreto tem corpo - implementação
    default int minus(int a, int b) {
        return a - b;
    }
}

public class Lambda02 {

    public static void main(String[] args) {
        
        //Parâmetros: (a,b)
        //Corpo da função: (a+b) - Implementação da interface
        Calculator sum = (a,b) -> a+b;
        Calculator plus = (a,b) -> a*b;
        Calculator min = (a,b) -> a-b;

        //Atribuindo a variável
        int result = min.minus(4, 8);
        System.out.println("Variável result: " + result);

        System.out.println("Soma: " + sum.calc(4, 5));
        System.out.println("Multiplicação: " + plus.calc(4, 5));
        System.out.println("Subtração: " + min.minus(4, 5));

    }
    
}
