package week4.ManageStudent;

import Utilities.Utility;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Student> stdList = new ArrayList();
    private static Scanner sc = new Scanner(System.in);

    private void run() {
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

    private void create() {
        System.out.println("---Adding a new student---");
        String id;
        while (true) {
            id = Utility.getValidString("^[0-9]{3}$", "Enter student's ID:", "Please enter a number!!!");
            boolean isDuplicate = false;
            for (Student d : stdList) {
                if (d.getId().equals(id)) {
                    isDuplicate = true;
                    System.out.println("Duplicate id !!!");
                }
            }
            if (isDuplicate) {
                break;
            }
        }

        String name = Utility.getValidString("^[A-Z][a-z]+(?: [A-Z][a-z]+)*$", "Enter student's name:", "Please enter a name!!!");
        String semester = Utility.getValidString("^[A-Z]{4}\\d{4}$", "Enter semester:", "Please enter a semester!!");
        ArrayList<Course> courses = new ArrayList<>();
        while (true) {
            String courseID = Utility.getValidString("^.*$", "Enter course id:", "Invalid data!!!");
            String courseName = Utility.getValidString("^.*$", "Enter course name", "Invalid data!!!");
            int credit = Utility.getPositiveInt("Enter credit:", "Invalid data!!!");
            Course c = new Course();
            courses.add(c);
            System.out.println("Do you want to add more course for this student?(y/n)");
            System.out.print("You choose:");
            String contin = sc.next();
            if (contin.charAt(0) == 'n' || contin.charAt(0) == 'N') {
                break;
            }

        }

        Student m = new Student();
        m.setId(id);
        m.setName(name);
        m.setSemester(semester);
        m.setCourseRegisted(courses);
        stdList.add(m);
    }

    private void findAndSort() {
        String id = Utility.getValidString("^.*$", "Enter course id:", "Invalid data!!!");
        for (Student d : stdList) {
            if (d.getId().equals(id)) {
                System.out.println(d);
            }
        }
    }

    private void update() {
        String id = Utility.getValidString("^.*$", "Enter course id:", "Invalid data!!!");
        for (Student d : stdList) {
            if (d.getId().equals(id)) {
                String op = sc.nextLine().trim();
                switch (op) {
                    case "U":
                        String newName = Utility.getValidString("^[A-Z][a-z]+(?: [A-Z][a-z]+)*$", "Enter new name:", "Invalid name!");
                        String newSemester = Utility.getValidString("^[A-Z]{4}\\d{4}$", "Enter new semester:", "Invalid semester!");
                        d.setName(newName);
                        d.setSemester(newSemester);
                        System.out.println("Student updated successfully!");
                        break;
                    case "D":
                        stdList.remove(d);
                        System.out.println("deleted!!!");
                        break;
                    default:
                        System.out.println("Invalid input!!!");
                }
            }
        }
    }

    private void report() {
        if (stdList.isEmpty()) {
            System.out.println("No students available for report!");
            return;
        }

        for (Student s : stdList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
}
