package tdd.Testing;

public class Account01 {
    private String name;
    private double account;

    private double balance;

    public  Account01 (String name, double account, double balance){
        this.name = name;
        this.account = account;
        this.balance = balance;

    }

    public String getName (){
        return name;

    }
    public void setName(String name){
        this.name = name;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}

