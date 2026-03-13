package W4;

import java.util.Scanner;

public class W4_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수 입력(1 이상 10 이하): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result1 = Facto.factoVal(a);
        int result2 = Facto.factoVal(b);

        Facto.result = result1 - result2;

        System.out.println(result1 + ", " + result2 );





    }
}

class Facto{
    static int result;

    static int factoVal(int x){
        int fac = 1 ;
        if(x < 0)
            return 01;
        else if (x == 0)
            return 0;
        else {
            for(int i = 1; i <= x; i ++){
                fac *= i;
            }
        }

        return fac;



    }
}
