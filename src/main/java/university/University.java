package university;


import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Faculty> faculties = new ArrayList<>();
    private int numberOfEmployees;

    public University(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Геттеры и сеттеры
    public List<Faculty> getFaculties() {
        return faculties;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}