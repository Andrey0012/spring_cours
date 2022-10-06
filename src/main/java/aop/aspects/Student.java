package aop.aspects;

public class Student {

    private String naneSurname;
    private int course;
    private double avgGrade;

    public Student(String naneSurname, int course, double avgGrade) {
        this.naneSurname = naneSurname;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "naneSurname='" + naneSurname + '\'' +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getNaneSurname() {
        return naneSurname;
    }

    public void setNaneSurname(String naneSurname) {
        this.naneSurname = naneSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
