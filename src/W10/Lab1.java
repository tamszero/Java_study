package W10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to generate?");
        int n = sc.nextInt();

        /*
        Time[] t = new Time[n];
        int i;
        for(i = 0; i < t.length; i++){
            t[i] = new Time(randNum(24), randNum(60), randNum(60));
        }
        for(i = 0; i < n; i ++){
            System.out.println("<Time " + (i+1) + "> ");
            System.out.println(t[i]);
        }
         */

        ArrayList <Time> t = new ArrayList<Time>();
        int i;
        for(i=0; i<n; i++){
            t.add(new Time(randNum(24), randNum(60), randNum(60)));


            for(i=0; i<t.size(); i++)
                System.out.println("<Time " + (i+1) + "> ");
            System.out.println(t.get(i));
        }



    }


    public static int randNum(int n){
        return (int)(Math.random() * n);
    }
}

class Time{
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){
        return "Hour: " + hour+ "\tMinute: " + minute +"\tSecond";
    }
}
