
package Bai13lap2;

import java.util.Comparator;


public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getBrithday().isAfter(o2.getBrithday())) { 
            return 1;
        } else if (o1.getBrithday().isBefore(o2.getBrithday())) {
            return -1;
        } else {
            return 0;
        }
    }

}
