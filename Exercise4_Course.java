
/**
 * Write a description of class UniversityCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercise4_Course
{
 

    
    private String courseCode;
    private String courseName;
    private String instructorName;
    private int creditHours;
    private int maxCapacity;
    private int enrolledStudents;
    private boolean isActive;

    
    public Exercise4_Course() {
        this.courseCode = "";
        this.courseName = "";
        this.instructorName = "";
        this.creditHours = 0;
        this.maxCapacity = 0;
        this.enrolledStudents = 0;
        this.isActive = true;
    }

    
    public Exercise4_Course(String courseCode, String courseName, int creditHours, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        setCreditHours(creditHours);
        setMaxCapacity(maxCapacity);
        this.enrolledStudents = 0;
        this.isActive = true;
    }

    
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public boolean isActive() {
        return isActive;
    }

    
    public void setCreditHours(int creditHours) {
        if (creditHours >= 1 && creditHours <= 6) {
            this.creditHours = creditHours;
        } else {
            System.out.println("Invalid credit hours. Must be between 1 and 6.");
        }
    }

    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity > 0) {
            this.maxCapacity = maxCapacity;
        } else {
            System.out.println("Invalid capacity. Must be greater than 0.");
        }
    }

    
    public void assignInstructor(String name) {
        this.instructorName = name;
    }

    public boolean enrollStudent() {
        if (isActive && enrolledStudents < maxCapacity) {
            enrolledStudents++;
            return true;
        }
        return false;
    }

    public void dropStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
        }
    }

    public int getAvailableSeats() {
        return maxCapacity - enrolledStudents;
    }

    public boolean isFull() {
        return enrolledStudents == maxCapacity;
    }

    public void cancelCourse() {
        if (enrolledStudents == 0) {
            isActive = false;
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructorName);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Max Capacity: " + maxCapacity);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Available Seats: " + getAvailableSeats());
        System.out.println("Active: " + isActive);
        System.out.println("-----------------------------------");
    }

    
    public static void main(String[] args) {

        System.out.println("=== University Course Exercise ===\n");

        
        Exercise4_Course course1 =
                new Exercise4_Course("PT821", "Object-Oriented Programming", 3, 40);

        Exercise4_Course course2 =
                new Exercise4_Course("PT822", "Database Systems", 3, 35);

        
        course1.assignInstructor("Dr. John Mwita");
        course2.assignInstructor("Ms. Amina Said");

        
        for (int i = 0; i < 38; i++) {
            course1.enrollStudent();
        }

        
        course1.displayCourseInfo();

        // Check available seats
        System.out.println("Available seats in course1: " + course1.getAvailableSeats());

        
        for (int i = 0; i < 5; i++) {
            if (!course1.enrollStudent()) {
                System.out.println("Enrollment failed: course is full.");
            }
        }

        
        System.out.println("Is course1 full? " + course1.isFull());

        
        for (int i = 0; i < 3; i++) {
            course1.dropStudent();
        }

        
        System.out.println("\nFinal Course Information:");
        course1.displayCourseInfo();
        course2.displayCourseInfo();

        System.out.println("\n=== Exercise Complete ===");
    }
}

