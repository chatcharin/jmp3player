/*
 * Adviser.java
 *
 * Created on November 24, 2006, 7:35 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package xprojects;
import java.util.*;
/**
 *
 * @author bamboo
 */
public class Adviser extends Human{
    
    private Student[] student= new Student[10];
    private int indext;
    /** Creates a new instance of Adviser */
    public Adviser() { 
        indext = 0;
    }
    public Adviser(String n){
        name = n;  
        indext = 0;
    }
    public void addStudent(Student stu){
        if(indext >=0&&indext<10){
            student[indext] = stu;
            indext++;
        }else System.out.println("Student is full");
       
    }
    public void showStudent(){
        for(int i=0;i<indext;i++)
            System.out.println(student[i].getName());
    }
    /**
     * Studentf  a
     * @see 
     */
    public Student getStudent(){
        if(indext>0)
          return student[indext--];
        else return null;   
    } 
    
    
    
}
