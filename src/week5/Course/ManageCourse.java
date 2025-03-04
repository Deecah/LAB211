package week5.Course;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageCourse {

    ArrayList<Course> listCourse = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void add() {
        while (true) {
            System.out.println("*** Add new course ***");
            System.out.print("Online (O) or Offline (F):");
            String op;
            op = sc.next();
            if (op.charAt(0) == 'O') {
                System.out.println("Creating new online course");
                OnlineCourse o = new OnlineCourse();
                o.inputAll(listCourse);
                listCourse.add(o);
            }
            if (op.charAt(0) == 'F') {
                System.out.println("Creating new offline course");
                OfflineCourse f = new OfflineCourse();
                f.inputAll(listCourse);
                listCourse.add(f);
            }
        }

    }

    public void updateCourse() {
    System.out.print("Enter course ID to update: ");
    int courseID = Utility.getValidInt("Enter course ID:", "ID is a number (XXX) !!!");
    Course courseToUpdate = null;

    for (Course c : listCourse) {
        if (c.getCourseID() == courseID) {
            courseToUpdate = c;
            break;
        }
    }

    if (courseToUpdate == null) {
        System.out.println("No data found!");
        return;
    }

    System.out.println("*** Updating ***");
    System.out.println("Note: Enter empty if you don't want to change it.");

    Field[] fields = courseToUpdate.getClass().getDeclaredFields();
    for (Field field : fields) {
        field.setAccessible(true);
        if (field.getName().equals("courseID")) continue;

        try {
            Object currentValue = field.get(courseToUpdate);
            System.out.print(field.getName() + " (" + currentValue + "): ");
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                if (field.getType().equals(int.class)) {
                    field.set(courseToUpdate, Integer.parseInt(input));
                } else {
                    field.set(courseToUpdate, input);
                }
            }
        } catch (IllegalAccessException e) {
            System.out.println("Failed to update " + field.getName());
        }
    }

    System.out.println("Updated successfully.");
}

    public void delete() {
        System.out.print("Enter course'ID to delete:");
        int dele = Utility.getValidInt("Enter course ID:", "ID is a number (XXX) !!!");
        boolean isFound = false;
        for (Course c : listCourse) {
            if (c.getCourseID() == dele) {
                isFound = true;
                listCourse.remove(c);
                System.out.println("Deleted!!!");
            }
        }
        if (isFound == false) {
            System.out.print("No data found, do you want to find again? (Y/N):");
            String yn = sc.next();
            if (yn.charAt(0) == 'Y') {
                delete();
            } else {
                return;
            }
        }
    }

    public void display() {
        System.out.println("***Print Course***");
        if (sc.next().charAt(0) == 'A') {
            for (Course c : listCourse) {
                System.out.println(c);
            }
        }
        if (sc.next().charAt(0) == 'O') {
            for (Course c : listCourse) {
                if (c instanceof OnlineCourse) {
                    System.out.println(c);
                }
            }
        }
        if (sc.next().charAt(0) == 'F') {
            for (Course c : listCourse) {
                if (c instanceof OfflineCourse) {
                    System.out.println(c);
                }
            }
        }
    }
    public void search(){
        System.out.println("***Searching***");
        System.out.print("Enter course'ID to search:");
        int s = Utility.getValidInt("Enter course ID:", "ID is a number (XXX) !!!");
        for(Course c : listCourse){
            if(c.getCourseID()== s){
                System.out.println(c);
            }
        }
    }
}
