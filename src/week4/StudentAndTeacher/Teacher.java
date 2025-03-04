
package week4.StudentAndTeacher;

public class Teacher extends Person{
    private int yearOfProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearOfProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0;
    }

    public int getYearOfProfession() {
        return yearOfProfession;
    }

    public void setYearOfProfession(int yearOfProfession) {
        this.yearOfProfession = yearOfProfession;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
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

    @Override
    public void inputAll() {
        super.inputAll();
        yearOfProfession = Utility.getValidInt("", "");
        contractType = Utility.getValidString("", "", "");
        salaryCoefficient = Utility.getValidDouble("", "");
    }

 

   
    
    
}
