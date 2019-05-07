 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author User
 */
public /*final*/ class SavingsAccount extends Account {//final é uma maneira de evitar que SavingsAccount seja extendido
                                                       // final no método não permite override
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Double interestRate, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void updateBalance() {
        
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    
}
