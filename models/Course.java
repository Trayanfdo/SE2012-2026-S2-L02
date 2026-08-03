package models;
public class Course {
    private String coursetitle;
    private String courseID;

    public Course(String name, String ID) {
        this.coursetitle = name;
        this.courseID = ID;
    }
    /**
     * Gets the course's name.
     * @return the course's name
     */
    public String getCourseName() {
        return coursetitle;
    }

    /**
     * Gets the course's ID.
     * @return the course's ID
     */
    public String getCourseID() {
        return courseID;
    }
    /**
     * Returns a string representation of the course.
     * @return a string representation of the course
     */
    @Override
    public String toString() {
        return "Course Name: " + this.coursetitle + ", Course ID: " + this.courseID;
    }
}