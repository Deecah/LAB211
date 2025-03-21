
package week8.Geographic;
import Utilities.Utility;
import java.util.ArrayList;

public class ManageEastAsiaCountries {
    private ArrayList<EastAsiaCountries> dacountry = new ArrayList<>();

    public ManageEastAsiaCountries() {
    }

    public void add(EastAsiaCountries e){
        dacountry.add(e);
    }
    
    public void createCountry(){
        String id = Utility.getValidString("", "", "");
        String name = Utility.getValidString("", "", "");
        String terrain = Utility.getValidString("", "", "");
        double area = Utility.getValidDouble("", "");
        EastAsiaCountries newcountry = new EastAsiaCountries(terrain, id, area, name);
        dacountry.add(newcountry);
    }
    
    public void display(){
        for(EastAsiaCountries e : dacountry){
            System.out.println(e);
        }
    }
    
}
