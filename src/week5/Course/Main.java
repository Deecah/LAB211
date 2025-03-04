package week5.Course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageCourse m = new ManageCourse();
        System.out.println("*** Course Management ***\n"
                + "1. Add online course/ offline course\n"
                + "2. Update course\n"
                + "3. Delete course\n"
                + "4. Print all / online course / offline course\n"
                + "5. Search information base on course name\n"
                + "6. Exit");
        System.out.print("You choose:");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                m.add();
                break;

            case 2:
                m.updateCourse();
                break;

            case 3:
                m.delete();
                break;

            case 4:
                m.display();
                break;

            case 5:
                m.search();
                break;
            case 6:
                System.exit(0);

        }
    }

}
