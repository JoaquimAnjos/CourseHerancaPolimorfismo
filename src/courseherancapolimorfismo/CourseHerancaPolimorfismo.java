 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseherancapolimorfismo;

import entities.BusinessAccount;
import entities.Account;

/**
 *
 * @author User
 */
public class CourseHerancaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BusinessAccount bcc = new BusinessAccount(1002,"Maria",0.0, 500.0);
        Account acc = new Account(1001,"Alex",1000.0);
        acc.withdraw(200.0);
        System.out.println(acc.getBalance());
        
        Account acc1 = bcc;
    }
    
}
