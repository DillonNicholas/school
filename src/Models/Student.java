package Models;

public class Student {
    // Properties (fields) of the Student class
    public String name;
    public int age;
    public String gradeLevel;
    public int studentID;
    public double gpa;

    public Student() {
        this.name = "";
        this.age = 1;
        this.gradeLevel = "";
        this.studentID = 1;
        this.gpa = 3.0;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Student ID: " + studentID);
        System.out.println("GPA: " + gpa);
        System.out.println("Enrolled Courses: " + String.join(", ", enrolledCourses));
    }
}
