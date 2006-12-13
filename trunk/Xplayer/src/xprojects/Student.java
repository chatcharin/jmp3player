/*
 * Student.java
 *
 * Created on November 24, 2006, 7:52 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package xprojects;

/**
 *
 * @author bamboo
 */
public class Student extends Human{
    private  Adviser  adviser;
    private  Project  project;
    /** Creates a new instance of Student */
    public Student() {
    }
    public Student(String n){
       name = n;  
    }
    public Student(String n,Adviser a){
        name = n;  
        a.addStudent(this);
        adviser = a;
    }
    
    public void setAdviser(Adviser a){
        a.addStudent(this);
        adviser = a;
    }
    public String getNameAdviser(){
       return  adviser.getName();
    } 
    
    public String getProName(){
        return project.getProjectName();
    }
   

    
}
