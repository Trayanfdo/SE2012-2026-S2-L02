package mainapp;
import java.util.Scanner;
import models.Course;
import models.Student;
import services.EnrollManager;

public class Main {
    public static void main(String[] args) {
        EnrollManager Manager = new EnrollManager();
        Scanner ChoiceIN = new Scanner(System.in);
        int choice;


        do{
            //----------MENU--------------------
            System.out.println("-----------Menu-----------");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Display Students(Sorted)");
            System.out.println("4. Display Courses(Sorted)");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. Search Student");
            System.out.println("7. Exit");
            //---------------------------------
            System.out.print("Enter your choice: ");
            choice = ChoiceIN.nextInt();
            ChoiceIN.nextLine(); // Consume the newline character after reading the integer input
            switch (choice){
                case 1:
                    Manager.addStudent();
                    break;
                case 2:
                    Manager.addCourse();
                    break;
                case 3:
                    System.out.println("1.Sort by ID ");
                    System.out.println("2.Sort by Name ");
                    System.out.print("Enter your choice: ");
                    int sortstudentChoice = ChoiceIN.nextInt();
                    ChoiceIN.nextLine();
                    switch(sortstudentChoice) {
                        case 1:
                            Manager.sortbyStudentID(Manager.getStudents(), Manager.studentCount);
                            break;
                        case 2:
                            Manager.sortbyStudentName(Manager.getStudents(), Manager.studentCount);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    System.out.println("List of Students:");
                    Student[] currentStudents = Manager.getStudents();
                    for(int j = 0 ; j<Manager.studentCount; j++){
                        System.out.println(currentStudents[j].toString());
                    }
                    break;
                case 4:
                    System.out.println("1.Sort by ID ");
                    System.out.println("2.Sort by Name ");
                    System.out.print("Enter your choice: ");
                    int sortCourseChoice = ChoiceIN.nextInt();
                    ChoiceIN.nextLine();
                    switch(sortCourseChoice) {
                        case 1:
                            Manager.sortbyCourseID(Manager.getCourses(), Manager.courseCount);
                            break;
                        case 2:
                            Manager.sortbyCourseName(Manager.getCourses(), Manager.courseCount);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    System.out.println("List of Courses:");
                    Course[] currentCourses = Manager.getCourses();
                    for(int j = 0 ; j<Manager.courseCount; j++){
                        System.out.println(currentCourses[j].toString());
                    }
                    break;
                case 5:
                    Manager.EnrollStudent();
                    break;
                case 6:
                    System.out.println("1.Search by ID ");
                    System.out.println("2.Search by Name ");
                    System.out.print("Enter your choice: ");
                    int searchStudentChoice = ChoiceIN.nextInt();
                    ChoiceIN.nextLine();
                    switch(searchStudentChoice) {
                        case 1:
                            System.out.print("Enter Student ID: ");
                            String studentID = ChoiceIN.nextLine();
                            Manager.findStudentByID(studentID, Manager.studentCount);
							
                            break;
                        case 2:
                            System.out.print("Enter Student Name: ");
                            String studentName = ChoiceIN.nextLine();
                            Manager.findStudentByName(studentName, Manager.studentCount);
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (choice <= 7);
    }
}
