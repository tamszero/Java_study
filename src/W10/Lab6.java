package W10;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        LinkedList<Integer> myStack = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num1;
        while (true){
            System.out.println("Push numbers(0 to quit) : ");
            num1 = sc.nextInt();
            if(num1 == 0)
                break;
            myStack.addLast(num1);
        }
        System.out.println("Popped Result");
        while (!myStack.isEmpty()){
            int num2 = myStack.removeLast();
            System.out.println(num2);
        }
    }
}
