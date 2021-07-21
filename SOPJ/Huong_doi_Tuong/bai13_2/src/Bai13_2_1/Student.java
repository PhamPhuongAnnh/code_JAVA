package Bai13_2_1;
import java.time.LocalDate;
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private double gpa;

    public Student() {
    }
    public Student(int id, String firstName, String lastName, LocalDate birthday, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {  
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", gpa=" + gpa + '}';
       }
    
    
}
