package Models;

public class Teacher {
    // Properties (fields) of the Teacher class
    public String name;
    public String subject;
    public int experienceYears;
    public String email;
    public int age;
    public double salary;
    public int teacherID;

    public Teacher() {
        this.name = "";
        this.subject = "";
        this.experienceYears = 2;
        this.email = "";
        this.salary = 0;
        this.age = 2;
        this.teacherID = 1;

    }
    

    // Constructor
    public Teacher(String name, String subject, int experienceYears, String email, int age, double salary) {
        this.name = name;
        this.subject = subject;
        this.experienceYears = experienceYears;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display teacher information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Years of Experience: " + experienceYears);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

