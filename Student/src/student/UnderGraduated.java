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
public class UnderGraduated extends Student {
    private String project;
    
    public UnderGraduated(String project, long id) {
        super(id);
        this.project = project;
    }

    @Override
    public String toString() {
        return "UnderGraduated{" + "id: " + super.getInfo() + "project=" + project + '}';
    }
    
    
}
