import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student one = new Student("Jamal");
        one.addCourse("Physical Education", 100);
        one.addCourse("Foods", 95);
        one.addCourse("Physics", 90);
        one.addCourse("English", 85);
        System.out.println(one.showCourses());
        System.out.println("Average Grade of Student:" + one.averageGrade());
        System.out.println(one.getCourses().get(0));
        System.out.println(one);

        Student two = new Student("What is my ID?");
        System.out.println(two);
    }
}