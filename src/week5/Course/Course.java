package week5.Course;

import java.util.ArrayList;
import java.util.Scanner;
import Utilities.Utility;
public class Course {

    protected int courseID;
    protected String courseName;
    protected int credits;

    public Course() {
        this.courseID = 0;
        this.courseName = "";
        this.credits = 0;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return courseID + "-" + courseName + "-" + credits;
    }

    
    
    public void inputAll(ArrayList<Course> courses) {

        Scanner sc = new Scanner(System.in);
        while(true){
            courseID = Utility.getValidInt("Enter course ID(XXX):", "ID is a number (XXX) !!!");
            boolean isDuplicate = false;
            for(Course c : courses){
                if(c.getCourseID()==courseID){
                    isDuplicate = true;
                    System.out.println("Duplicate course ID!!!");
                }
            }
            if(isDuplicate == false){
                break;
            }
        }
        

        courseName = Utility.getValidString("^[a-zA-ZÀ-Ỹà-ỹ\\\\s]+$", "Enter course name:", "Please enter a course name !!!!");
        while (true) {
            try {
                System.out.print("Enter course credit:");
                credits = Integer.parseInt(sc.nextLine());
                if (credits > 0) {
                    break;
                }
                System.out.println("Credits is a number greater than 0 !!!!");
            } catch (NumberFormatException e) {
                System.out.printf("Credits is a number greater than 0 !!!!");
            }
        }
    }

    
}
