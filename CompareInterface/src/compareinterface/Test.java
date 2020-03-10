/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareinterface;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Saraf
 */
public class Test {
    public static void main(String[] args) {
        Student[] stds = new Student[3];
        stds[0] = new Student(5, 18, "Jame");
        stds[1] = new Student(2, 20, "Anne");
        stds[2] = new Student(7, 19, "John");
        
        for (Student std : stds) {
            System.out.println(std);
        }
        System.out.println("1-----");
        Arrays.sort(stds);
        for (Student std : stds) {
            System.out.println(std);
        }
        
        System.out.println("2-----");
        Comparator ageComp = new AgeComparator();
        Arrays.sort(stds, ageComp);
        for (Student std : stds) {
            System.out.println(std);
        }
        
        System.out.println("3-----");
        Arrays.sort(stds, Student.nameComparator());
        for (Student std : stds) {
            System.out.println(std);
        }
    }
   
}
