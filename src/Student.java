import java.util.Objects;

public class Student {

    public int gpa;
    public String firstName;
    public String lastName;

    public Student(int gpa, String firstName, String lastName) {
        this.gpa = gpa;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return gpa == student.gpa && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    public boolean equalsByGpa (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return gpa == student.gpa;
    }

    public boolean equalsByLastName (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return Objects.equals(lastName,student.lastName);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + gpa; result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        return result;
    }
}
