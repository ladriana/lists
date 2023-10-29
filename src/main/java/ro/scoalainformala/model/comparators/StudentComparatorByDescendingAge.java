package ro.scoalainformala.model.comparators;

import ro.scoalainformala.model.Student;

import java.util.Comparator;

public class StudentComparatorByDescendingAge implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge()) {
            return -1;
        } else if (s1.getAge() == s2.getAge()) {
            return 0;
        }
        return 1;
    }
}
