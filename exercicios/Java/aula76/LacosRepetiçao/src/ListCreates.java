import javax.print.attribute.standard.MediaName;

public class ListCreates {

    public static void main(String[] args) {
        

        double grades[] = {50,70,40,80,20,100};

        double media = 0;
        double total = 0;

        for (int i = 0; i < grades.length; i ++) {

            total += grades[i];

        }

        media = total/grades.length;

        if (media < 60) {
            System.out.println("Reprovado com média: "+ media);
        } else {
            System.out.println("Aprovado com média: "+ media);
        }
    }
}