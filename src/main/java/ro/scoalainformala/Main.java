package ro.scoalainformala;

import ro.scoalainformala.model.Student;
import ro.scoalainformala.model.comparators.StudentComparatorByAscendingAge;
import ro.scoalainformala.model.comparators.StudentComparatorByDepartment;
import ro.scoalainformala.model.comparators.StudentComparatorByDescendingAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // "Program against interfaces instead of implementations."
        List<Student> students = new ArrayList<>(); // type inference

        // pp. LinkedList are metoda reverse()
        // List nu contine metoda reverse()
        // nici ArrayList nu contine metoda reverse()

        students.add(new Student("Mary", 18,"CS"));
        students.add(new Student("John", 20,"Law"));
        students.add(new Student("Jimmy", 19,"Arts"));

        System.out.println("List of students by department:");
        Collections.sort(students, new StudentComparatorByDepartment());

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("List of students by ascending age:");
        Collections.sort(students, new StudentComparatorByAscendingAge());

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("List of students by descending age:");
        Collections.sort(students, new StudentComparatorByDescendingAge());

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
