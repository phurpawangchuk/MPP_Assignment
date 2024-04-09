package Assignment2.prob2AEasy;

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

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", Grade=" + gradeReport.getGrade() +
                '}';
    }
}
