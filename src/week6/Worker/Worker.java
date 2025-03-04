
package week6.Worker;

public class Worker {
    private int id;
    private String name;
    private int age;
    private int salary;
    private String workLocation;

    public Worker() {
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.salary = 0;
        this.workLocation = "";
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    
    
}
