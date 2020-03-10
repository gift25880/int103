/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saraf
 */
public class Person {
    private long idCard;
    private String fName;
    private String lName;
    
    public Person(long idCard, String firstName, String lastName) {
        this.idCard = idCard;
        this.fName = firstName;
        this.lName = lastName;
    }
    
    public long getIdCard() {
        return this.idCard;
    }
    
    public String getFirstName() {
        return this.fName;
    }
    
    public String getLastName() {
        return this.lName;
    }
    
    public void setFirstName(String newFirstName) {
        this.fName = newFirstName;
    }
    
    public void setLastName(String newLastName) {
        this.lName = newLastName;
    }

    @Override
    public String toString() {
        return "Person{" + "idCard=" + idCard + ", fName=" + fName + ", lName=" + lName + '}';
    }
}

