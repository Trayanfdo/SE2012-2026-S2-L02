package models;
public class Student{
    private String StudentID;
    private String Name;
    public Course[] courselist;

    public Student(String ID, String name){
        this.StudentID = ID;
        this.Name = name;
        this.courselist = new Course[5];
    }
    /**
     * Gets the student's ID.
     * @return the student's ID
     */
    public String getID(){
        return StudentID;
    }
    /**
     * Gets the student's name.
     * @return the student's name
     */
    public String getName(){
        return Name;
    }
    /**
     * Returns a string representation of the student.
     * @return a string representation of the student
     */
    @Override
    public String toString(){
        return "Student ID: " + this.StudentID + ", Name: " + this.Name;
    }
}