package Bai13_2_1;
import java.time.LocalDate;
public class Sutudent {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private double gpa;

    public Sutudent() {
    }
    public Sutudent(int id, String firstName, String lastName, LocalDate birthday, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Sutudent{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", gpa=" + gpa + '}';
    }
    
    
}
