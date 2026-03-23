package W8;

import java.util.Scanner;

public class W8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two integers");
        int n1, n2, n3;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        try {
            n3 = n1 / n2;
            System.out.println("n1/n2 = " + n3);
        } catch (Exception e){
            System.out.println("Don't divide a number with zero!!!");
        }
    }
}
