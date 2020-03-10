
import student.Graduated;
import student.Person;
import student.Student;
import student.UnderGraduated;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class Test {
    public static void main(String[] args) {
        Person p = new UnderGraduated("Y", 1);
        System.out.println(p);
//        Student[] stds = new Student[10];
//        stds[0] = new Student(1);
//        stds[1] = new UnderGraduated("Chatbot", 2);
//        stds[2] = new Graduated(3, "Information Retrieval");
//        
//        System.out.println(stds[0].getThesis());
//        System.out.println(stds[2].getThesis());
        
//        for (int i = 0; i < 3; i++) {
//            System.out.println(stds[i].toString());
//        }
        
        
    }
}
