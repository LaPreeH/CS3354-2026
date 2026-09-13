package edu.txst.constructors;

/**
 * The Student class represents a student and stores
 * information such as name, major, and GPA.
 */
public class UpdatedStudent {

    // Instance variables store information for each Student object.
    private String firstName;
    private String lastName;
    private String major;
    private double gpa;

    // Sets the student's first name.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Returns the student's first name.
    public String getFirstName() {
        return firstName;
    }

    // Sets the student's last name.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Returns the student's last name.
    public String getLastName() {
        return lastName;
    }

    // Sets the student's major.
    public void setMajor(String major) {
        this.major = major;
    }

    // Returns the student's major.
    public String getMajor() {
        return major;
    }

    // Sets the student's GPA.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Returns the student's GPA.
    public double getGpa() {
        return gpa;
    }

    // Default constructor gives the student empty values
    // and sets the GPA to 0.0.
    public Student() {
        this("", "", "", 0.0);
    }

    // Parameterized constructor allows values to be given
    // when a Student object is created.
    public Student(String firstName, String lastName, String major, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.gpa = gpa;
    }

    public static void main(String[] args) {

        // Creates student1 using the default constructor.
        Student student1 = new Student();

        System.out.println("Student 1");
        System.out.println("First name: " + student1.getFirstName());
        System.out.println("Last name: " + student1.getLastName());
        System.out.println("Major: " + student1.getMajor());
        System.out.println("GPA: " + student1.getGpa());

        // Creates student2 using the parameterized constructor.
        Student student2 = new Student("Peter", "Parker", "Computer Science", 3.5);

        System.out.println("\nStudent 2");
        System.out.println("First name: " + student2.getFirstName());
        System.out.println("Last name: " + student2.getLastName());
        System.out.println("Major: " + student2.getMajor());
        System.out.println("GPA: " + student2.getGpa());

        // Creates student3 using another set of sample values.
        Student student3 =
                new Student("Jordan", "Lee", "Mathematics", 3.7);

        System.out.println("\nStudent 3");
        System.out.println("First name: " + student3.getFirstName());
        System.out.println("Last name: " + student3.getLastName());
        System.out.println("Major: " + student3.getMajor());
        System.out.println("GPA: " + student3.getGpa());

        // Changes student3's GPA using a setter method.
        student3.setGpa(3.9);

        System.out.println("Updated GPA: " + student3.getGpa());
    }
}
