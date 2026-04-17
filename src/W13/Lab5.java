package W13;

class SharedArea{
    double result;
    boolean isWritten;
}

public class Lab5 {
    public static void main(String[] args) {

        ComputeThread th1 = new ComputeThread();
        PrintThread th2 = new PrintThread();
        SimplePrintThread th3 = new SimplePrintThread();
        CutePrintThread th4 = new CutePrintThread();

        SharedArea SH = new SharedArea();

        th1.sharedArea = SH;
        th2.sharedArea = SH;
        th3.sharedArea = SH;
        th4.sharedArea = SH;

        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }
}

class ComputeThread extends Thread{
    SharedArea sharedArea;
    public void run(){
        double res = 0.0;
        for(int i=1; i<100000; i += 2){
            if(i / 2%2 == 0 )
                res += 1.0/i;
            else
                res -= 1.0/i;
        }
        sharedArea.result = res * 4;
        sharedArea.isWritten = true;
        synchronized (sharedArea){
            sharedArea.notifyAll();
        }
    }
}



class PrintThread extends Thread{
    SharedArea sharedArea;
    public void run(){
        if (sharedArea.isWritten != true){
            try{
                synchronized (sharedArea){
                    sharedArea.wait();
                }
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(sharedArea.result);
    }
}

class SimplePrintThread extends Thread{
    SharedArea sharedArea;
    public void run(){
        if (sharedArea.isWritten != true){
            try {
                synchronized (sharedArea){
                    sharedArea.wait();
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.printf("%.2f \n", sharedArea.result);
    }
}
class CutePrintThread extends Thread {
    SharedArea sharedArea;

    public void run() {
        if (sharedArea.isWritten != true) {
            try {
                synchronized (sharedArea) {
                    sharedArea.wait();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("<<< pi = " + sharedArea.result + " >>>");
    }
}

