/*
 * Game.java
 *
 * Created on November 23, 2006, 1:48 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

/**
 *
 * @author bamboo
 */
public class Game {
  private  Dice dice_1;
  private  Dice dice_2;
    
    /** Creates a new instance of Game */
    public Game() {
        dice_1 = new Dice("A");
        dice_2 = new Dice("B");
    }
    public void playGame(){
        dice_1.toToss();
        dice_2.toToss();
        System.out.println("Dice A:"+dice_1.getValue()+"  Dice B:"+dice_2.getValue());
    }
    public boolean reSult(){
        if((dice_1.getValue()+dice_2.getValue())==7)
            return true;
        else return false;
    }
    
    
}
