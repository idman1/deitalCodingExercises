package tdd.Testing;

public class Account002 {
    public static void main(String[] args) {

        Account01 SavingAccount = new Account01("muni",30,000000);
        SavingAccount.setName("tolu");
        System.out.println(SavingAccount.getName());

        SavingAccount.setBalance(10000);
        System.out.println(SavingAccount.getAccount());

        SavingAccount.setAccount(60123984);
        System.out.println(SavingAccount.getBalance());







    }
}

