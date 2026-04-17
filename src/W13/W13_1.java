package W13;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class W13_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number of coin toss: ");

        int num = sc.nextInt();

        SA sa = new SA();
        SimulThread th1 = new SimulThread(sa, num);
        PrintTh th2 = new PrintTh(sa);

        th1.start();
        th2.start();

    }
}


//SA
class SA{
    double ratio;
    boolean isReady;

}

//동전을 던지는 스레드
class SimulThread extends Thread{
    SA sa;
    int num;

    SimulThread(SA sa, int num){
        this.sa = sa;
        this.num = num;

    }

    public void run(){
        int head = 0;

        for(int i=0; i<num; i++){
            if(Math.round(Math.random()) == 1){
                head ++;
            }
        }

        synchronized (sa){
            sa.ratio = ((double)head/num)*100;
            sa.isReady = true;
            sa.notify();
        }

    }


}

// 시뮬레이션의 결과 출력 스레드
class PrintTh extends Thread{
    SA sa;

    PrintTh(SA sa){
        this.sa =sa;
    }

    public void run(){
        synchronized (sa){
            while (sa.isReady != true){
                try{
                    sa.wait();
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.printf("Front Ratio: %.2f", sa.ratio);

        }

    }

}
