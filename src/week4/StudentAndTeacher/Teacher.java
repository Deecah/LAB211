    
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
   
}
