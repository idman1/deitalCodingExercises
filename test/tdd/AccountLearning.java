package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountLearning{
    @Test
    public void depositTesting(){
        AccountLeaning01 idrisAccount = new AccountLeaning01();
        idrisAccount.deposit(6000);
        int idrisAccountBalance = idrisAccount.getbalance();
        assertEquals(6000,idrisAccountBalance);
    }

    @Test
    public void depositMoreTesting(){
    AccountLeaning01 idrisAccount = new AccountLeaning01();
    idrisAccount.deposit(6000);
    idrisAccount.deposit(6000);
    int idrisAccountBalance = idrisAccount.getbalance();
    assertEquals(12000,idrisAccountBalance);
    }
    @Test
    public void nagativeDepositTesting(){
        AccountLeaning01 idrisAccount = new AccountLeaning01();
        idrisAccount.deposit(6000);
        idrisAccount.deposit(-3000);
        idrisAccount.deposit(4000);
        int idrisAccountBalance = idrisAccount.getbalance();
        assertEquals(10000,idrisAccountBalance);
    }

    @Test
    public void withdrawalTesting(){
        AccountLeaning01 idrisAccount = new AccountLeaning01();
        idrisAccount.deposit(7000);
        idrisAccount.withdrawal(2000);
        int idrisAccountBalance = idrisAccount.getbalance();
        assertEquals(5000,idrisAccountBalance);
    }
    @Test
    public void withdrawalMoreThanTesting(){
        AccountLeaning01 idrisAccount = new AccountLeaning01();
        idrisAccount.deposit(5000);
        idrisAccount.withdrawal(6000);
        int idrisAccountBalance = idrisAccount.getbalance();
        assertEquals(5000, idrisAccountBalance);

    }
    @Test
    public void withdrawalZero(){
        AccountLeaning01 idrisAccount = new AccountLeaning01();
        idrisAccount.deposit(0);
        idrisAccount.withdrawal(6000);
        int idrisAccountbalance = idrisAccount.getbalance();
        assertEquals(0,idrisAccountbalance);
    }

    @Test
    public void inputpin(){
        AccountLeaning01 idrisAccount =new AccountLeaning01();
        idrisAccount.withdrawalpin("1234");
        idrisAccount.deposit(5000);
        idrisAccount.withdrawal(4000);
        int idrisAccountbalance = idrisAccount.getbalance();
        assertEquals(1000,idrisAccountbalance);
        int idrisAccountbalancen= idrisAccount.getbalance();
        assertEquals(1234,idrisAccountbalancen);




    }
}
