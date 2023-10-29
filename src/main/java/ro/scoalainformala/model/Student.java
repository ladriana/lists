package ro.scoalainformala.model;

import java.util.UUID;

public class Student implements Comparable<Student> {

    private UUID id;
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) {
        id = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "This student's name and age is " + name + " " + age
                + " and he/she studies at " + department;
    }

    @Override
    public int compareTo(Student s) {
        return this.name != null ?
                (s.name != null ?
                        this.name.compareTo(s.name) :
                        1) :
                -1;
    }
}
