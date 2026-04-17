package W13;

public class Lab9 {
    public static void main(String[] args) {
        TestThread th1 = new TestThread();
        th1.start();

        try{
            th1.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Bye Bye");
    }
}

class TestThread extends Thread{
    public void run(){
        for (int i=0; i<10; i++)
            System.out.println("Hello");
    }
}
