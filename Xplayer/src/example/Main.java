/*
 * Main.java
 *
 * Created on November 23, 2006, 1:29 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;
import java.util.Scanner;
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
    boolean exit=true;
    int     input;
    Maneger   driver = new Maneger();
    Scanner scanner=new Scanner(System.in);
        do{  
        System.out.println("\"Wecom to play GAME\"\n" +
                           "press 0:Create Game and Player\n" +
                           "press 1:to pay down\n" +
                           "press 2:to play Game\n" +
                           "press 3:Exit Game");
        input = scanner.nextInt();
        switch(input){
        case 0:System.out.println("Cearte Player\n" +
                    "Insert Player Name and Money");
              driver.setPlayer(new Player(scanner.next(),scanner.nextInt()));
              System.out.println(driver.getPlayer().getName()+"Create Player success !!"); 
              break;
        case 1: if(driver.getPlayer()!=null){
                  driver.toPaydown();  
                  System.out.println(driver.getPlayer().getName()+"to pay down success !!"); 
                }else {System.out.println("!!! You Create Player please !!!");}
               break;
        case 2: if(driver.getPlayer()!=null){
                   driver.toPlayGame();
                   driver.isWins();
                }else {System.out.println("!!! You Create Player please !!!!");}
               break;
        case 3:if(driver.getPlayer()!=null){
                  driver.showMoney();
                  exit=false;
               }else {System.out.println("!!! You Create Player please !!!");}
             break;
        default :System.out.println("!! Line feed is interger please !!");     
        }
        }while(exit);
       
       // TODO code application logic here
    }

}
