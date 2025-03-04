
package week4.StudentAndTeacher;

public class Person  {
    protected int id;
    protected String name;
    protected int phoneNumber;
    protected int yearOfBirth;
    protected String major;

    public Person() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = 0;
        this.yearOfBirth = 0;
        this.major = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
 
    public void inputAll(){
        id = Utility.getValidInt("Enter ID:","ID is 6 digits");
        name = Utility.getValidString("","","");
        phoneNumber = Utility.getValidInt("", "");
        yearOfBirth = Utility.getValidInt("", "");
        major = Utility.getValidString("", "", "");
    }
}
