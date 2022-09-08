public class ListAges {
    
    public static void main(String[] args) {
        

        int ages[] = {18,20,19,34,12,18,22,23};

        int i = 0;
        Boolean m = false;

        while (i < ages.length) {
            System.out.println("Idade: "+ ages[i]);
            i++;
        }

        i = 0;

        while (m == false) {
            System.out.println("Idade: "+ ages[i]);

            if(ages[i] < 18){
                System.out.println("Menor de idade");
                m = true;
            }
            i++;
        }
    }
}
