package W13;

public class Lab10 {
    public static void main(String[] args) {
        Myth th1 = new Myth();


        th1.start();

        //th1.setDaemon(true);
        //th1.start();

        for(int i=0; i<10; i++){
            System.out.println(i);
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        th1.setStop(true);




    }
}
class Myth extends Thread{
    boolean stop;
    public void setStop (boolean s){
        stop = s;
    }

    public void run(){
        for(char c = 'A'; c <'Z'; c++){
            if(stop == true)
                break;
            System.out.println(c);
            try{
                sleep(10);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}


