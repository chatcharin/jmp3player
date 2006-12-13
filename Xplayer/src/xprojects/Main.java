/*
 * Main.java
 *
 * Created on November 24, 2006, 7:32 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package xprojects;

/**
 *
 * @author bamboo
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Adviser adviser = new Adviser("Anan");
       Student student_1= new Student("Bamboo",adviser);
       Student student_2= new Student("Chatcharin",adviser);
       System.out.println("Student getName Adviser"+student_1.getNameAdviser());
       System.out.println("Adviser ShowStudent");
       adviser.showStudent();
       
// TODO code application logic here
    }
   
    
}
