package Assignment2.prob2A;

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
