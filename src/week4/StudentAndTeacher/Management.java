package week4.StudentAndTeacher;

import Utilities.Utility;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {

    private static ArrayList<Person> pList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*** Information Management ***\n"
                + "1. Teacher\n"
                + "2. Student\n"
                + "3. Person\n"
                + "4. Exit");
        System.out.print("You choose: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                manageTeacher();
                break;
            case 2:
                manageStudent();
                break;
            case 3:
                managePerson();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid data!!!");
        }
    }

    private static void manageTeacher() {
        System.out.print("*** Teacher Management ***\n"
                + "1. Input\n"
                + "2. Print\n"
                + "3. Exit\n"
                + "You choose:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                inputTeacher();
                break;
            case 2:
                printTeacher();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid data");
        }
    }

    private static void manageStudent() {
        System.out.print("*** Student Management ***\n"
                + "1. Search\n"
                + "2. Print all\n"
                + "3. Exit\n"
                + "You choose:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                inputStudent();
                break;
            case 2:
                printStudent();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid data");
        }
    }

    private static void managePerson() {
        System.out.println("*** Person Management ***\n"
                + "1. Search\n"
                + "2. Print all\n"
                + "3. Exit\n"
                + "You choose:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                search();
                break;
            case 2:
                printAll();
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid data");
        }
    }

    private static void printTeacher() {
        for (Person p : pList) {
            if (p instanceof Teacher) {
                System.out.println(p);
            }
        }
    }

    private static void printStudent() {
        for (Person p : pList) {
            if (p instanceof Student) {
                System.out.println(p);
            }
        }
    }

    private static void printAll() {
        for (Person p : pList) {
            System.out.println(p);
        }
    }

    private static void inputTeacher() {
        int id = Utility.getValidInt("Enter ID:", "ID is 6 digits");
        String name = Utility.getValidString("^[A-ZÀ-Ỹa-zà-ỹ]+(?: [A-ZÀ-Ỹa-zà-ỹ]+)*$", "Enter teacher name:", "Invalid data!!!");
        int phoneNumber = Utility.getValidInt("Enter phone number:", "Invalid data!!!");
        Year yearOfBirth;
        while (true) {
            try {
                int year = Utility.getValidInt("Enter year of birth", "Invalid data");
                yearOfBirth = Year.of(year);
                if (yearOfBirth.isBefore(Year.now())) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        String major = Utility.getValidString("^.*$", "Enter major:", "Invalid data!!!");
        int yearOfProfession = Utility.getValidInt("Enter year of profession:", "Invalid data!!!");
        String contractType = Utility.getValidString("^(Long|Short)$", "Enter contract type:", "Invalid data!!!");
        double salaryCoefficient = Utility.getValidDouble("Enter salary coefficient:", "Invalid data!!!");
        Teacher t = new Teacher();
        t.setId(id);
        t.setName(name);
        t.setPhoneNumber(phoneNumber);
        t.setYearOfBirth(yearOfBirth);
        t.setMajor(major);
        t.setYearOfProfession(yearOfProfession);
        t.setContractType(contractType);
        t.setSalaryCoefficient(salaryCoefficient);
        pList.add(t);
    }

    private static void inputStudent() {
        int id = Utility.getValidInt("Enter ID:", "ID is 6 digits");
        String name = Utility.getValidString("^[A-ZÀ-Ỹa-zà-ỹ]+(?: [A-ZÀ-Ỹa-zà-ỹ]+)*$", "Enter teacher name:", "Invalid data!!!");
        int phoneNumber = Utility.getValidInt("Enter phone number:", "Invalid data!!!");
        Year yearOfBirth;
        while (true) {
            try {
                int year = Utility.getValidInt("Enter year of birth", "Invalid data");
                yearOfBirth = Year.of(year);
                if (yearOfBirth.isBefore(Year.now())) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        String major = Utility.getValidString("^.*$", "Enter major:", "Invalid data!!!");
        Year yearOfAdmission;
        while (true) {
            try {
                int year = Utility.getValidInt("Enter year of birth", "Invalid data");
                yearOfAdmission = Year.of(year);
                if (yearOfAdmission.isBefore(Year.now())) {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int entranceEnglishScore;
        while(true){
            entranceEnglishScore = Utility.getValidInt("Enter entrance english score:", "Invalid data");
            if(entranceEnglishScore>=0){
                break;
            }
        }
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setPhoneNumber(phoneNumber);
        s.setYearOfBirth(yearOfBirth);
        s.setMajor(major);
        s.setYearOfAdmission(yearOfAdmission);
        s.setEntranceEnglishScore(entranceEnglishScore);
        pList.add(s);
    }

    private static void search() {

        int id = Utility.getValidInt("Ênter ID to search:", "Invalid data!!!");
        for (Person a : pList) {
            if (a.getId() == id) {
                System.out.println(a);
                break;
            }
        }
    }
}
