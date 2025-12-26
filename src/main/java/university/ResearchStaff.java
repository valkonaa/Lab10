package university;

import java.util.ArrayList;
import java.util.List;

public class ResearchStaff extends Employee {
    private String researchArea;
    private List<Institute> institutes = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public ResearchStaff(String name, String socialSecurityNumber, String email, String researchArea) {
        super(name, socialSecurityNumber, email);
        this.researchArea = researchArea;
    }

    public void assignToInstitute(Institute institute) {
        institutes.add(institute);
        institute.addResearchStaff(this);
    }

    public void assignToProject(Project project) {
        projects.add(project);
        project.addResearchStaff(this);
    }

    // Геттеры и сеттеры
    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public List<Institute> getInstitutes() {
        return institutes;
    }

    public List<Project> getProjects() {
        return projects;
    }
}