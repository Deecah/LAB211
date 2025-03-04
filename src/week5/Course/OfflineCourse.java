
package week5.Course;

import java.time.LocalDate;
import java.util.ArrayList;

public class OfflineCourse extends Course {
    private LocalDate begin;
    private LocalDate end;
    private String campus;

    public OfflineCourse() {
        this.begin = LocalDate.now();
        this.end = begin.plusDays(120);
        this.campus = "";
    }

    

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    @Override
    public String toString() {
        return "-" + begin + "-" + end + "-" + campus;
    }

    
    
    @Override
    public void inputAll(ArrayList<Course> courses) {
        super.inputAll(courses);
        while(true){
             begin = Utility.getValidDate("Enter begin of the course", "Invalid date! Please enter a valid date in the format dd/MM/yyyy !!!");
             if(begin.isAfter(LocalDate.now())){
                 break;
             }
        }
       while(true){
           end = Utility.getValidDate("Enter end of the course", "Invalid date! Please enter a valid date in the format dd/MM/yyyy !!!");
           if(end.isAfter(begin)){
               break;
           }
       }
        
        campus = Utility.getValidString("^[A-ZÀ-Ỹ][a-zà-ỹ]*(\\\\s[A-ZÀ-Ỹ][a-zà-ỹ]*)*$", "Enter campus:", "Please enter a properly campus !!!");
    }
    
    
    
    
}
