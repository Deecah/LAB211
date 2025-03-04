
package week5.Airport;

public class OnlineCourse extends Course{
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        this.platform = "";
        this.instructor = "";
        this.note = "";
    }

    
    public void inputAll(String id, String name, int credit, String platform, String instructor, String note) {
        super.inputAll(id, name, credit);
        this.platform = platform;
        this.instructor = instructor;
        this.note = note;
    }

    @Override
    public String toString() {
        
        return super.toString() + "OnlineCourse{" + "platform=" + platform + ", instructor=" + instructor + ", note=" + note + '}';
    }
    
    
    
    
}
