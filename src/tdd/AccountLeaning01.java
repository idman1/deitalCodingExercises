package tdd;

public class AccountLeaning01 {



    private int Gtbank;
    private String inputpin = String.valueOf(1234);

    public void deposit(int amount) {
        if (amount >0)
        Gtbank = amount;
        ;
    }

    public void withdrawal(int amount) {
        if(amount > 0 && amount <= Gtbank )

        Gtbank = Gtbank - amount;


    }
    public void withdrawalpin(String atmpin){
        inputpin = atmpin;
    }

    public int getbalance(){
        return Gtbank;
    }
}
