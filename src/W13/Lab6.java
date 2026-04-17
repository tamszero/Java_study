package W13;

import com.sun.source.doctree.ThrowsTree;

public class Lab6 {
    public static void main(String[] args) {
        sharedArea sharedarea = new sharedArea();

        sharedarea.Acc1 = new Account("Tom", "123", 30000000);
        sharedarea.Acc2 = new Account("Jane", "456", 10000000);

        TransferThread th1 = new TransferThread(sharedarea);
        Printthread th2 = new Printthread(sharedarea);

        th1.start();
        th2.start();

    }
}
class sharedArea{
    Account Acc1;
    Account Acc2;
}
class Account {
    String accountNo;
    String ownerName;
    int balance;

    Account(String accountNo, String ownerName, int balance){
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(int amount){
        this.balance += amount;
    }
    int withdraw(int amount){
        if(balance < amount)
            return 0; //not enough
        balance -= amount;
        return amount;
    }

}

class TransferThread extends Thread{
    int money;
    sharedArea sharedarea;
    TransferThread(sharedArea area){
        sharedarea = area;
    }

    public void  run(){
        for (int montth=1; montth<=12; montth++){
            synchronized (sharedarea){
                money = sharedarea.Acc1.withdraw(1000);
                System.out.println("Month " + montth + ": 1000 drawal from ACC1");
                sharedarea.Acc2.deposit(money);
                System.out.println("Month " +montth+": 1000 deposit in ACC2");
            }
        }
    }
}

class Printthread extends Thread{
    sharedArea sharedarea;
    Printthread(sharedArea area){
        sharedarea = area;
    }

    public void run(){
        for(int i=0; i<50; i++){
            synchronized (sharedarea){
                int money_sum = sharedarea.Acc1.balance + sharedarea.Acc2.balance;
                System.out.println("Sun of money: " + money_sum);

            }
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}