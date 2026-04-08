package W10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        HashSet<String> myStet = new HashSet<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 5 NAmes");

        for(int i = 0; i<5; i++)
            myStet.add(sc.next());
        System.out.println("HashSet size: " + myStet.size());

        Iterator<String> it = myStet.iterator();
        String name;
        while (it.hasNext()){
            name = it.next();
            System.out.println(name);
        }
    }
}
