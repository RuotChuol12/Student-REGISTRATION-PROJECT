

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    String department;

    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString(){
        return "Student { " + " name ='" + name + '\'' + ", id = " + id + ", department='" + department + '\'' + '}';
    }

}

/**
 *
 */
 class StudentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<>();

        boolean continueRegistration = true;
        while (continueRegistration) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();

            System.out.println(" Enter student ID:");

            int id = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter student departmeent:");
            String department = scanner.nextLine();

            Student newStudent = new Student(name, id, department);

            studentArrayList.add(newStudent);

            System.out.println("Student Registered: " + newStudent);

            System.out.println("Do you want to register another student ? (yes/no)");

            String continueChoice = scanner.nextLine().toLowerCase().trim();
            continueRegistration = continueChoice.equals("yes");
        }

        System.out.println(" \nRegistered Students:");

        for (Student student : studentArrayList) {

            System.out.println(student.toString());


        }


    }
}
