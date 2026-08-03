package services;
import java.util.Scanner;
import models.Course;
import models.Student;
public class EnrollManager {
    public Scanner input = new Scanner(System.in);
    public Student[] students;
    public Course[] courses;
    public int studentCount;
    public int courseCount;

    public EnrollManager() {
        this.students = new Student[100];
        this.courses = new Course[100];
        this.studentCount = 0;
        this.courseCount = 0;
    }
    /**
     * Enrolls a student in a course.
     */
    public void EnrollStudent() {
        System.out.print("Enroll Student(Enter Student ID):");
        String studentID = input.nextLine();
        System.out.print("Enroll Student(Enter Course ID):");
        String courseID = input.nextLine();
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getID().equals(studentID)) {
                for (int j = 0; j < courseCount; j++) {
                    if (courses[j].getCourseID().equals(courseID)) {
                        for (int k = 0; k < students[i].courselist.length; k++) {
                            if (students[i].courselist[k] == null) {
                                students[i].courselist[k] = courses[j];
                                System.out.println("Student " + students[i].getName() + " enrolled in course " + courses[j].getCourseName());
                                return;
                            }
                        }
                    }
                }
                System.out.println("Course not found.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    /**
     * Adds a new student to the system.
     */
    public void addStudent(){
        System.out.print("Enter Student ID: ");
        String studentID = input.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = input.nextLine();
        if (studentCount < students.length) {
            students[studentCount] = new Student(studentID, studentName);
            studentCount++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student array is full. Cannot add more students.");
        }
    }
    /**
     * Adds a new course to the system.
     */
    public void addCourse(){
        System.out.print("Enter Course Name: ");
        String courseName = input.nextLine();
        System.out.print("Enter Course ID: ");
        String courseID = input.nextLine();
        if (courseCount < courses.length) {
            courses[courseCount] = new Course(courseName, courseID);
            courseCount++;
            System.out.println("Course added successfully.");
        } else {
            System.out.println("Course array is full. Cannot add more courses.");
        }
    }
    /**
     * Returns the array of students.
     */
    public Student[] getStudents() {
        return students;
    }
    /**
     * Returns the array of courses.
     */
    public Course[] getCourses() {
        return courses;
    }
    //---------------------Sort & Search----------------------------------
    public void sortbyStudentID (Student[] students, int studentCount) {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].getID().compareTo(students[j + 1].getID()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    /** */
    public void sortbyStudentName (Student[] students, int studentCount) {
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - i - 1; j++) {
                if (students[j].getName().compareTo(students[j + 1].getName()) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    /**
     * sort the course by Name.
     */
    public void sortbyCourseName (Course[] courses, int courseCount) {
        for (int i = 0; i < courseCount - 1; i++) {
            for (int j = 0; j < courseCount - i - 1; j++) {
                if (courses[j].getCourseName().compareTo(courses[j + 1].getCourseName()) > 0) {
                    Course temp = courses[j];
                    courses[j] = courses[j + 1];
                    courses[j + 1] = temp;
                }
            }
        }
    }
    /**
     * Sorts the courses by their IDs.
     */
    public void sortbyCourseID (Course[] courses, int courseCount) {
        for (int i = 0; i < courseCount - 1; i++) {
            for (int j = 0; j < courseCount - i - 1; j++) {
                if (courses[j].getCourseID().compareTo(courses[j + 1].getCourseID()) > 0) {
                    Course temp = courses[j];
                    courses[j] = courses[j + 1];
                    courses[j + 1] = temp;
                }
            }
        }
    }
    /**
     * Search course by their IDs.
     */
    public Student findStudentByID(String StudentID,int studentCount) {
        for (int i = 0; i < studentCount ; i++) {
            if (students[i] != null && students[i].getID().equals(StudentID)) {
                return students[i];
            }
        }
        return null; // Course not found
    }
    public Student findStudentByName(String studentName,int studentCount){
        for (int i = 0; i < studentCount ; i++) {
            if (students[i] != null && students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        return null; // Course not found
    }
}