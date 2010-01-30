/*
 * BankAccount.java
 *
 * Created on November 23, 2006, 6:29 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author bamboo
 */
public class BankAccount {
    private String accname;
    private double balance;
    
    /** Creates a new instance of BankAccount */
    public BankAccount(String name) {
       accname = name;
    }
    public BankAccount(String name,double bl){
       accname =  name;
       balance = bl;
    }
    public void toDraw(double money){
        if(money <=balance){
            balance-=money;
           System.out.println("You get success... money :"+money+
                   "\n You have balance:"+balance);
        }else System.out.println("!!! You have money inadequate.....");
    }
    public void dePosit(double money){
        if(money>0){
            balance+=money;
        System.out.println( accname+" deposit Success!!!");
        }else System.out.println("!!! You can't deposit , money inadequate.....");
    }
    public void toTransfer(BankAccount bankacc,double money){
      if(money <= balance){
        bankacc.dePosit(money);
        balance-=money;
       System.out.println(accname+" Transfer Success!!!");
      }else System.out.println("!!! You can't toTranfer, money inadequate.....");
    }
  
    public void reNameAcc(String name){
      accname = name;
       System.out.println("You rename success!!!");
    }
    public double showBalance(){
        return balance;
    }
    public void printing(){
     System.out.print("test");
    }
   
}
