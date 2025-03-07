package week4.ManageStudent;

import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private String semester;
    private ArrayList<Course> courseRegisted;

    public Student() {
        this.id = "";
        this.name = "";
        this.semester = "";
        this.courseRegisted = new ArrayList<Course>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public ArrayList<Course> getCourseRegisted() {
        return courseRegisted;
    }

    public void setCourseRegisted(ArrayList<Course> courseRegisted) {
        this.courseRegisted = courseRegisted;
    }

    
    
    
}
