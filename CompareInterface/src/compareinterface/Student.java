/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareinterface;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Saraf
 */
public class Student implements Comparable<Student> {
    private long id;
    private int age;
    private String name;

    public Student(long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public int compareTo(Student t) {
        Objects.requireNonNull(t);
        return Long.compare(this.id, t.id);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", age=" + age + ", name=" + name + '}';
    }
    
    public static Comparator ageComparator() {
        return new AgeComparator();
    }
    
    public static Comparator nameComparator() {
        return new NameComparator();
    }
    
    public static Comparator<Student> nameComparatorV2() {
        return new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
             return t1.getName().compareTo(t2.getName());   
            }
        };
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student t1, Student t2) {
        return t1.getName().compareTo(t2.getName());
    }
    
}