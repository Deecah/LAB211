
package week6.Worker;

import java.util.ArrayList;
import Utilities.Utility;
public class ManageWorker {
    ArrayList<Worker> mWorker = new ArrayList<>();
    
    
    
    void add(Worker w){
        while(true){
            w.setId(Utility.getValidInt("Enter ID:", "Invalid data!")); 
            boolean isDuplicate = false;
            for(Worker c : mWorker){
                if(c.getId()==w.getId()){
                    System.out.println("Duplicate data!");
                    isDuplicate = true;
                }
            }
            if(isDuplicate=true){
                break;
            }
        }  
        w.setName(Utility.getValidString("","Enter name:", "Invalid data!"));
        w.setAge(Utility.getPositiveInt("Enter age:", "Invalid data!"));
        w.setSalary(Utility.getPositiveInt("Enter salary:", "Invalid data!"));
        w.setWorkLocation(Utility.getValidString("","Enter ID", "Invalid data!"));
        
    }
    
    
}
