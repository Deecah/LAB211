package week4.ManageStudent;

public class Main {
     ListStudent stdList = new ListStudent();
    void run() {
        while (true) {
            int choice;
            System.out.println("WELCOME TO STUDENT MANAGEMENT\n"
                    + "\n"
                    + "1. Create\n"
                    + "2. Find and Sort\n"
                    + "3. Update/Delete\n"
                    + "4. Report\n"
                    + "5. Exit");
            choice = Utility.getValidInt("Enter your choice:", "Please enter a choice!!!");
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    findAndSort();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    report();
                    break;
                case 5:
                    System.exit(0);
            }
        }

    }
    void create(){
        System.out.println("---Adding a new student---");
        String a = Utility.getValidString("^[0-9]{3}$", "Enter student's ID:","Please enter a number!!!" );
        String b = Utility.getValidString("^[A-Z][a-z]+(?: [A-Z][a-z]+)*$", "Enter student's name:","Please enter a name!!!" );
        String c = Utility.getValidString("^[A-Z]{4}\\d{4}$", "Enter semester:","Please enter a semester!!" );
        String d = Utility.getValidString("^(Java|\\.Net|C/C\\+\\+)$", "Enter student's course(Java | .Net | C/C++):","Please enter a course (Java | .Net | C/C++)!!!" );
        
        Student m = new Student(a, b, c, d);
        stdList.addStudent(m);
    }
    void findAndSort(){
        
    }
    void update(){
        
    }
    void report(){
        
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}
