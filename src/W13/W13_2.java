package W13;

import javax.swing.*;

public class W13_2 {
    public static void main(String[] args) {

        Sarea sa = new Sarea();
        wordThread th1 = new wordThread(sa);
        PThread th2 = new PThread(sa);

        th1.start();
        th2.start();

    }
}

class Sarea{
    String currentword;
    boolean stop;

    public synchronized void setStop(boolean stop){
        this.stop = stop;
    }
}

class wordThread extends Thread{
    Sarea sa;

    String[] array = {"cat" , "dog" , "monkey", "elephaunt", "zebra", "rabbit", "turtle", "dolphin", "mouse", "rat", "lion", "tiger", "dear", "snake", "aligator"
    };

    wordThread(Sarea sa){
        this.sa = sa;
    }

    public void  run(){
        for(int i=20; i>0; i--){
            if(sa.stop == true)
                break;

            int random = (int) (Math.random() * array.length);
            sa.currentword = array[random];

            System.out.println(sa.currentword);

            try{
                sleep(3000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

        if(sa.stop != true)
            System.out.println("실패!");
    }
}

class PThread extends Thread{
    Sarea sa;

    PThread(Sarea sa){
        this.sa = sa;
    }

    public void run(){
        while (sa.stop != true){
            String input = JOptionPane.showInputDialog("Enter a String");
            System.out.println("<" + input + "> 을 입력하셨습니다." );

            if(input.equals(sa.currentword)){
                System.out.println("정답!");
                sa.setStop(true);
                break;
            }
        }
    }
}