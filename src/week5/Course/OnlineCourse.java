package week5.Course;

import java.util.ArrayList;
import Utilities.Utility;
public class OnlineCourse extends Course{
  private String platform;  
  private String instructor;  
  private String note;    

    public OnlineCourse() {
        this.platform = "";
        this.instructor = "";
        this.note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "-" + platform + "-" + instructor + "-" + note;
    }

    @Override
    public void inputAll(ArrayList<Course> courses) {
        super.inputAll(courses);
        platform = Utility.getValidString("^[a-zA-ZÀ-Ỹà-ỹ\\\\s]+$", "Enter platform: ", "Please enter a platform!!!");
        instructor = Utility.getValidString("^[a-zA-ZÀ-Ỹà-ỹ\\\\s]+$", "Enter instructor: ", "Please enter instructor!!!");
        note = Utility.getValidString("^[a-zA-ZÀ-Ỹà-ỹ\\\\s]+$", "Enter note: ", "Please enter note!!!");
    }
    
    
  
}
