package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class Student extends Person{
    private long studentId;

    public Student() {
        this(0);
    }
    
    public Student(long studentId) {
        this.studentId = studentId;
    }
    
    public String getThesis() {
        return "nothing";
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + '}';
    }
    
    
}
