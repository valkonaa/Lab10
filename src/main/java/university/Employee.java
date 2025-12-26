package university;

public abstract class Employee {
    protected String name;
    protected String socialSecurityNumber;
    protected String email;

    public Employee(String name, String socialSecurityNumber, String email) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.email = email;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}