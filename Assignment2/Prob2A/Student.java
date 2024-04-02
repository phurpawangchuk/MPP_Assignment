package Assignment2.prob2A;

public class Student {
    private String studentName;
    private GradeReport gradeReport;

    public Student(String name){
        studentName = name;
        gradeReport = new GradeReport(this);
    }

    public GradeReport getGradeReport(){
        return  gradeReport;
    }

    public String getStdudentName(){
        return studentName;
    }

}
