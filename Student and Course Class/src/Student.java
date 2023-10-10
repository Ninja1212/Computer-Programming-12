import java.util.ArrayList;

public class Student {
    private String firstName;
    private static int identification = 0;
    private int studentID;
    private ArrayList<Course> courselist = new ArrayList<>();

    Student(String firstName) {
        this.firstName = firstName;
        this.studentID = identification;
        this.courselist = courselist;
        identification++;
    }

    public String toString() {
        return "Name: " + this.firstName + "&& Student ID: " + this.studentID;
    }

    public void addCourse(String subject, int grade) {
        courselist.add(new Course(subject, grade));
    }

    public String showCourses() {
        return courselist.toString();
    }

    public int averageGrade() {
        int total = 0;
        for (int i = 0; i < courselist.size(); i++) {
            total += courselist.get(i).getGrade();
        }
        return (total / (courselist.size()));
    }

    public ArrayList getCourses() {
        return courselist;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getID() {
        return studentID;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }
}
