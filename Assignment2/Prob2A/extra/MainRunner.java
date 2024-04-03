package Assignment2.prob2A.extra;

import Assignment2.prob2A.Student;
import Assignment2.prob2A.StudentGradeFactory;

public class MainRunner {
    public static void main(String[] args) {

        Student student = StudentGradeFactory.createStudent("Alice");

        String grade =  student.getGradeReport().getGrade();
        String name = student.getName();

        String result = String.format("Student :"+student+" Grade : "+ grade);
        System.out.println(result);

    }
}
