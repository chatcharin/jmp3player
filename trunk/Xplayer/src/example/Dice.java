/*
 * Dice.java
 *
 * Created on November 23, 2006, 1:31 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

/**
 *
 * @author bamboo
 */
public class Dice {
    private String name;
    private int value;
    /** Creates a new instance of Dice */
    public Dice(String n) {
        name = n;
    }
    public void toToss(){
        value = (int)(Math.random()*10%6+1);
    } 
    public int getValue(){
        return value;
    }
    public String getName(){
        return name;
    }
}
