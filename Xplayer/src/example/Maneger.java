/*
 * Maneger.java
 *
 * Created on November 23, 2006, 3:25 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package example;

/**
 *
 * @author bamboo
 */
public class Maneger {
    
    /** Creates a new instance of Maneger */
    public Maneger() {
        game = new Game();
    }
     private  int    money;
     private  Game   game;
     private  Player player;
     private final int FEE = 50;
    
    /**
     * @param args the command line arguments
     */
    public  void toPaydown(){
        if(player.getMoney()<=100)
          System.out.println(player.getName()+" can't to play Game");
        else {
            System.out.println(player.getName()+ " :Welcom to play Game");
            money = player.getMoney();
        } 
    }
    public void isWins(){
        if(player!=null&& money<50){
        if(game.reSult()){
        System.out.println(player.getName()+ " Win");
        money+=FEE;
       } else {
            System.out.println(player.getName()+ " lose");
            money-=FEE;
       }
        player.setMoney(money);}
    }
    public void toPlayGame(){
        if(money<50)
            System.out.println(player.getName()+ " can't to play Game");
        else {
            System.out.println("Game Runnig....");
            game.playGame();
        }
    }
    public void showMoney(){
        System.out.println("Name:"+player.getName()+"\n"+
                           "Money:"+player.getMoney());
    }
    public void setPlayer(Player p){
          player = p;
    }
    public Player getPlayer(){
        return player;
    }

    
}
