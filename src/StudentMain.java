import java.util.HashSet;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student(100,"Maksym","Krupka");
        Student student2 = new Student(95,"Daria","Krupka");
        Student student3 = new Student(100,"Ivan","Lavrinenko");

        System.out.println(student1.equalsByGpa(student3));
        System.out.println(student1.equalsByLastName(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students.size());

        Student student4 = new Student(100,"Maksym","Krupka");
        System.out.println(student1.equals(student4));
        System.out.println(student4.hashCode());
    }

}
