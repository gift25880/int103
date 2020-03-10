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
public class Graduated extends Student{
    private String thesis;
    
    public Graduated(long id, String thesis) {
        super(id);
        this.thesis = thesis;
    }
    
    @Override
    public String getThesis() {
        return thesis;
    }

    @Override
    public String toString() {
        return "Graduated{" + "thesis=" + thesis + '}';
    }
    
    
}
