package Assignment2.Prob2A;

public class GradeReport {
    private String grade;
    private Student studentAsOwner;

    GradeReport(Student student){
        studentAsOwner = student;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }

}
