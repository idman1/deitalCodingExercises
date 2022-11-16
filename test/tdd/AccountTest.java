package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class AccountTest {
    @Test
    public void depositTest(){
        //given
        Account deborahAccount = new Account();
        //when i deposit 5000
        deborahAccount.deposit(5000);
        //check that balance is 5000
        int deborahAccountBalance = deborahAccount.getBalance();
        // assertEquals method is a method in j.unit libraries
        assertEquals(5000, deborahAccountBalance);

    }

    @Test
    public void depositTwiceTest(){
    // given there is an account
        Account deborahAccount = new Account();
    // given that initial balance is 4000
        deborahAccount.deposit(4000);
    // when i deposit 2000
        deborahAccount.deposit(2000);
    // check that balance is 6000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(6000,deborahAccountBalance);


    }
  @Test
    public void depositNagativeAmountTest(){
        //given there is an amount
        Account deborahAccount = new Account();
        // given that initial balance is 4000
        deborahAccount.deposit(4000);
        // when i deposit -2000
        deborahAccount.deposit(-2000);
        // check that balance is 4000
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(4000, deborahAccountBalance);
    }
    @Test
    public void withdrawalAmountTest(){
        Account deborahAccount = new Account();
        deborahAccount.deposit(4000);
        deborahAccount.withdrawal(2000);
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(2000,deborahAccountBalance);

    }
    @Test
    public void nagativeWithdrawalTest(){
        Account deborahAccount = new Account();
        deborahAccount.deposit(6000);
        deborahAccount.withdrawal(3000);
         deborahAccount.withdrawal(1000);
        int deborahAccountBalance = deborahAccount.getBalance();
        assertEquals(3000,deborahAccountBalance);
    }
}
