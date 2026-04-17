package W13;

public class Lab7 {
}

class sharedA{
    Account Acc1;
    Account Acc2;

    void transfer(int money){
        synchronized (this){
            int money1 = Acc1.withdraw(money);
            System.out.println("1000 draw from Acc1");
            Acc2.deposit(money1);
            System.out.println("1000 deposit in Acc2");
        }
    }
    int getTotal(){
        synchronized (this){
            return Acc1.balance + Acc2.balance;
        }
    }
}
