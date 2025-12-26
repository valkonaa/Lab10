package university;

import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private String address;
    private List<ResearchStaff> researchStaffList = new ArrayList<>();

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addResearchStaff(ResearchStaff staff) {
        researchStaffList.add(staff);
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ResearchStaff> getResearchStaffList() {
        return researchStaffList;
    }
}