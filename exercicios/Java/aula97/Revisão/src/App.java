import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Student estudante = new Student(1, "Juliana", 12, 2366, 1988);
        estudante.getAge();

        List<Student> students = new ArrayList<Student>();
        List<Teacher> teachers = new ArrayList<Teacher>();

        students.add(new Student(1, "Isaias", 30, 17, 2022));
        students.add(new Student(2, "Pedro", 20, 90, 2012));
        students.add(new Student(3, "Vitória", 50, 57, 2021));

        teachers.add(new Teacher(4, "Tereza",30, 43, "Línguas"));
        teachers.add(new Teacher(5, "Eduardo", 45, 65, "Matemática"));
        teachers.add(new Teacher(6, "Mônica", 33, 40, "Programação"));

        System.out.println("Lista de estudantes:");
        students.stream().forEach(student -> System.out.println(student.getName()));
        students.stream().forEach(student -> System.out.println(student.getAge()));
        students.stream().forEach(student -> System.out.println(student.getYear()));

        System.out.println("Lista de professores:");
        teachers.stream().forEach(teacher -> System.out.println(teacher.getName()));
        teachers.stream().forEach(teacher -> System.out.println(teacher.getAge()));
        teachers.stream().forEach(teacher -> System.out.println(teacher.getArea()));
        
    }
}
