package day6;

public class Teacher {
    private String name;
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student, int estimate) {
        switch (estimate) {
            case 2:
                System.out.println("Преподователь " + name + " оценил студента " + student.getStudentName() + " по предмету " + getSubject() + "на оценку неудволетворительно");
                break;
            case 3:
                System.out.println("Преподователь " + name + " оценил студента " + student.getStudentName() + " по предмету " + getSubject() + "на оценку удволетворительно");
                break;
            case 4:
                System.out.println("Преподователь " + name + " оценил студента " + student.getStudentName() + " по предмету " + getSubject() + "на оценку хорошо");
                break;
            case 5:
                System.out.println("Преподователь " + name + " оценил студента " + student.getStudentName() + " по предмету " + getSubject() + "на оценку отлично");
                break;
            default:
                System.out.println("Неправильная оценка");
        }
    }
}
