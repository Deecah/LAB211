package week4.ManageStudent;

import java.util.ArrayList;

public class ListStudent {
    private ArrayList<Student> stdList = new ArrayList<>();

    public ListStudent() {
    }

    public ArrayList<Student> getStdList() {
        return stdList;
    }

    public void setStdList(ArrayList<Student> stdList) {
        this.stdList = stdList;
    }

    @Override
    public String toString() {
        return "ListStudent{" + "stdList=" + stdList + '}';
    }

    
    
    
}
