package W13;



public class Lab1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Mythread());
        thread.start();
        for(char ch = '!'; ch <= '/'; ch++){
            System.out.println(ch);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }
}

class Mythread implements Runnable{
    public  void run(){
        for(int i = 0; i <= 9; i ++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
