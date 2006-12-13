/*
 * Player.java
 *
 * Created on November 23, 2006, 1:42 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

/**
 *
 * @author bamboo
 */
public class Player {
    private String name;
    private int money;
    /** Creates a new instance of Player */
    public Player(String n) {
      name = n; 
      money= 200;
    }
    public Player(String n,int m){
       name = n;
       money = m;
    }
    public void setMoney(int m){
       money = m; 
    }
    public int getMoney(){
        return money;
    }
    public String getName(){
        return name;
    }
    

}
