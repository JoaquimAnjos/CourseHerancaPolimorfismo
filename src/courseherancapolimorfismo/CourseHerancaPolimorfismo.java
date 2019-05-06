 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseherancapolimorfismo;

import entities.BusinessAccount;
import entities.Account;
import entities.SavingsAccount;

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
        
        Account acc_sa = new SavingsAccount(0.01, 1002, "Maria", 1000.0);
        acc_sa.withdraw(200.0);
        System.out.println(acc_sa.getBalance());
        
        Account acc_ba = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc_ba.withdraw(200.0);
        System.out.println(acc_ba.getBalance());
        
        //UPCASTING 
        
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(0.01, 1004, "Anna", 0.0);
        
        //DOWNCASTING
        
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        
        //BusinessAccount acc5 = (BusinessAccount)acc3; erro em tem de execução por acc3 ser instância de SavingsAccount
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
    
}
