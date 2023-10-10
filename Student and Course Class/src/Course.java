public class Course {

    private String subject;
    private int grade;

    Course(String subject, int grade){
        this.grade = grade;
        this.subject = subject;
    }

    public String toString(){
        return "Course Name: " + this.subject;
    }

    public int getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}