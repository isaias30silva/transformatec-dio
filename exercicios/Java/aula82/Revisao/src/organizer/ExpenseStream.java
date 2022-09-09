package organizer;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.Scanner;

import java.util.Comparator;

public class ExpenseStream {

    public static void main(String[] args) {
        
        List<Expense> expenseList = new ArrayList<Expense>();

        Scanner scanner = new Scanner(System.in);

        expenseList.add(new Expense(1, "Agua", 50.00, "fixa", "15072022"));
        expenseList.add(new Expense(2, "Luz", 200.00, "fixa", "16072022"));
        expenseList.add(new Expense(3, "Janta", 150.00, "extra", "17072022"));
        expenseList.add(new Expense(4, "Farmacia", 450.00, "saude", "18072022"));
        expenseList.add(new Expense(5, "Carro", 850.00, "extra", "19072022"));
        expenseList.add(new Expense(6, "Dentista", 450.00, "saude", "2072022"));

        //System.out.println("Informe a quantidade de boletos: ");
        //int qt = Integer.parseInt(scanner.nextLine());

        //for (int i = 0; i < qt; i++) {

            //int id = i;

            //System.out.println("Informe o nome do boleto [" + i +"]:");
            //String name = scanner.nextLine();

            //System.out.println("Informe o valor do boleto [" + i +"]:");
            //Double amount = Double.parseDouble(scanner.nextLine());

            //System.out.println("Informe a data de vencimento do boleto [" + i +"]:");
            //String expireDate = scanner.nextLine();

            //System.out.println("Informe a categoria do boleto [" + i +"]:");
            //String category = scanner.nextLine();

            //expenseList.add(new Expense(id,name,amount,category,expireDate));
        //}

        //listando e exibindo todos os preços dos itens da lista
        System.out.println("Lista de valores dos boletos");
        List<Double> amountList = expenseList.stream().map(expense -> expense.getAmount()).collect(Collectors.toList());
        amountList.forEach(amount -> System.out.println(amount));

        //somando os valores de todos os boletos utilizando o reduce
        System.out.println("Valor total dos boletos");
        Double totalAmount = amountList.stream().reduce((double)0, (subtotal, amount) -> subtotal + amount);
        System.out.println(totalAmount);

        //somando o total dos boletos por categoria utilizando o filter
        System.out.println("Total por categoria de boletos");
        List<Double> categoryAmountList = expenseList
                                            .stream()
                                            .filter(expense -> expense
                                            .getCategory() == "fixa")
                                            .map(expense -> expense.getAmount())
                                            .collect(Collectors.toList());
        
        Double categoryAmount = categoryAmountList
                                    .stream()
                                    .reduce((double)0, (subtotal, amount) -> subtotal + amount);

        System.out.println(categoryAmount);


        //agrupamento boletos por tipo/categoria utilizando o map
        System.out.println("Agrupando boletos por categoria");
        Map<String, List<String>> groupedExpenses = expenseList
                                                        .stream()
                                                        .collect(Collectors.groupingBy(Expense::getCategory, Collectors.mapping(Expense::getName, Collectors.toList())));
        
        System.out.println(groupedExpenses);

        //comparando os valores dos boletos

        Comparator<Expense> comparator = Comparator.comparing(Expense::getAmount);

        //imprimindo o valor do boleto mais caro
        System.out.println("Boleto mais alto");
        Expense expensive = expenseList.stream().max(comparator).get();
        System.out.println(expensive.getName());

        //imprimindo o valor do boleto mais barato
        System.out.println("Boleto mais barato");
        Expense cheap = expenseList.stream().min(comparator).get();
        System.out.println(cheap.getName());
    }
    
}
