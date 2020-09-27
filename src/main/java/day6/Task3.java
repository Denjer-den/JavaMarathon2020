package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов Иван Ивнович", "Химия");
        Student student = new Student("Николаев Николай Николаевич");
        teacher.evaluate(student, 5);
    }
}
