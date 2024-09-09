package Services;

import Models.School;

import java.util.ArrayList;
import java.util.Optional;

public class SchoolRepository {
    public ArrayList<School> schools;

    public SchoolRepository() {
        this.schools = new ArrayList<>();
    }
    public void createSchool(School school) {
        this.schools.add(school);
    }
    public void editSchool(int schoolID, School school) {
       Optional<School> _school = this.schools.stream().filter(x -> x.schoolID == schoolID).findFirst();
       if (_school.isPresent()) {
           int index = this.schools.indexOf(_school);
           _school.
       }
    }

}
