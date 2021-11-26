
package Bai13lap2;
import java.time.LocalDate;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate brithday;
    private double gpa;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, LocalDate brithday, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.brithday = brithday;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBrithday() {
        return brithday;
    }

    public void setBrithday(LocalDate brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", brithday=" + brithday + ", GPA=" + gpa + '}';
    }

}
