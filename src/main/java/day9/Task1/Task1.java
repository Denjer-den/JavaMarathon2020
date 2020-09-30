package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Jack", "5325-g");
        Teacher teacher = new Teacher("John", "Mathematics");

        student.printInfo();
        teacher.printInfo();
    }
}
