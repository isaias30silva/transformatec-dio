package stacks;

public class CallStack {

    public static void main(String[] args) throws Exception {

        System.out.println("Objetivo do programa: incrementar o número 10 e chamar os métodos associados.");
        int number = 10;
        System.out.println("O número a ser incrementado: "+number);

        method01(number);

        System.out.println("Encerrando o programa principal - main");

    }

    public static void method01(int number) {
        System.out.println("Chamando método 1");
        int sum = 0;
        sum = number + 1;
        method02(sum);
        System.out.println("Encerrando o método 1");
    }

    public static void method02(int number) {
        System.out.println("Chamando método 2");
        int sum = 0;
        sum = number + 1;
        method03(sum);
        System.out.println("Encerrando o método 2");
    }

    public static void method03(int number) {
        System.out.println("Chamando método 3");
        int sum = 0;
        sum = number + 1;
        System.out.println("Resultado "+sum);
        System.out.println("Encerrando o método 3");
    }
}