package Assignment2.Prob2A.extra;

import Assignment2.Prob2A.Student;

public class MainRunner {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.getGradeReport().setGrade("A");
        String grade = student.getGradeReport().getGrade();

        System.out.println(
                String.format("Student %s has scored grade %s",
                        student.getStdudentName(),
                        grade)
        );

    }
}
