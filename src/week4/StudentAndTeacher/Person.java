
package week4.StudentAndTeacher;

import java.time.Year;

public class Person  {
    protected int id;
    protected String name;
    protected int phoneNumber;
    protected Year yearOfBirth;
    protected String major;

    public Person() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = 0;
        this.yearOfBirth = Year.now();
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

    public Year getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Year yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
 
}
