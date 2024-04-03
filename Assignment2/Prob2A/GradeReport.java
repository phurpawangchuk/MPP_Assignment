package Assignment2.prob2A;

public class GradeReport {
    private String grade;
    private Student owner;

    GradeReport(Student student){
        owner = student;
    }

    public String getGrade() {
        return grade;
    }

    public Student getOwner() {
        return owner;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
