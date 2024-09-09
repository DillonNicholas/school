package Models;

import java.util.ArrayList;

public class School {
    // Properties (fields) of the School class
    public String name;
    public String address;
    public int totalStudents;
    public int totalTeachers;
    public String[] coursesOffered;
    public boolean isPublic;
    public double ranking;
    public int schoolID;
    public ArrayList<Teacher> teachers;
    public ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        name = "";
        address = "";
        totalStudents = 0;
        totalTeachers = 0;
        coursesOffered = new String[5];
        isPublic = true;
        ranking = 1;
        schoolID = 1;

    }
    // Constructor
    public School(String name, String address, int totalStudents, int totalTeachers, String[] coursesOffered, boolean isPublic, double ranking) {
        this.name = name;
        this.address = address;
        this.totalStudents = totalStudents;
        this.totalTeachers = totalTeachers;
        this.coursesOffered = coursesOffered;
        this.isPublic = isPublic;
        this.ranking = ranking;
    }

    // Getter and Setter methods
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

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public int getTotalTeachers() {
        return totalTeachers;
    }

    public void setTotalTeachers(int totalTeachers) {
        this.totalTeachers = totalTeachers;
    }

    public String[] getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(String[] coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    // Other methods to represent the behavior of a school
    public void displayInfo() {
        System.out.println("School Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Teachers: " + totalTeachers);
        System.out.println("Public School: " + isPublic);
        System.out.println("Ranking: " + ranking);
        System.out.println("Courses Offered: " + String.join(", ", coursesOffered));
    }
}
