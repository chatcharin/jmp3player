/*
 * Project.java
 *
 * Created on November 24, 2006, 7:53 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package xprojects;

/**
 *
 * @author bamboo
 */
public class Project {
    private Student student;
    private String pro_name;
    /** Creates a new instance of Project */
    public Project() {
    }
    public Project(Student s,String p){
        pro_name = p;
        student  = s;
    }
    public Project(String p){
        pro_name = p;
    }
    public void addStudent(Student s){
        student = s; 
    }
    public String getProjectName(){
        return pro_name;
    }
    public String getStudentName(){
        return student.getName();
    }
    public void setName(String p){
         pro_name = p;
    }
    
}
