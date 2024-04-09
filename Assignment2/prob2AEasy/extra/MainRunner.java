package Assignment2.prob2AEasy.extra;

import Assignment2.prob2AEasy.GradeReport;
import Assignment2.prob2AEasy.Student;

public class MainRunner {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.getGradeReport().setGrade("A");
        String grade = student.getGradeReport().getGrade();

        System.out.println(student);

    }
}
