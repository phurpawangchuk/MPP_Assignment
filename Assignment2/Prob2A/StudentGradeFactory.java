package Assignment2.prob2A;

public class StudentGradeFactory {
    public static Student createStudent(String name){
        if(name == null)
            throw new IllegalArgumentException("Student name cannot be null");

        Student student = new Student(name);
//        student.getGradeReport().setGrade("A");

        return student;
    }

}
