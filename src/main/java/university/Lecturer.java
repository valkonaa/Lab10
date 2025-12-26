package university;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends ResearchStaff {
    private List<Course> courses = new ArrayList<>();

    public Lecturer(String name, String socialSecurityNumber, String email, String researchArea) {
        super(name, socialSecurityNumber, email, researchArea);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}