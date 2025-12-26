package university;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Dean dean;
    private List<Institute> institutes = new ArrayList<>();

    public Faculty(String name, Dean dean) {
        this.name = name;
        this.dean = dean;
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }
}