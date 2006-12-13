/*
 * Main.java
 *
 * Created on November 23, 2006, 6:28 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package bank;

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
        BankAccount A = new BankAccount("A",1000.0);
        BankAccount B = new BankAccount("B",1000.0);
        A.toTransfer(B,500.0);
        System.out.println("B have="+B.showBalance()+"  A have ="+A.showBalance());
    }
    
}
