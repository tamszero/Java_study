package W13;

public class Lab3 {
    public static void main(String[] args) {

        Thread thread1 = new Mythread_num();
        Thread thread2 = new Mythread_ch();

        thread1.start();
        thread2.start();

    }
}

class Mythread_num extends  Thread{
    public void  run(){
        for(int i = 0; i < 10; i ++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Mythread_ch extends Thread{
    public void run(){
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.println(ch);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
