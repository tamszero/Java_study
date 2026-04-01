package W9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string with ',' and ' '");
        String str = sc.nextLine();

        StringTokenizer token = new StringTokenizer(str, ", ");
        System.out.println("The tokens are ....");

        while (token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
    }
}
