package W3.Lab3_1;

import java.util.Scanner;

public class W3_1 {
    public static void main(String[] args) {

        Song s1 = new Song();
        Song s2 = new Song();

        Scanner sc = new Scanner(System.in);

        System.out.print("*Song 1*");
        System.out.println("곡명입력: " );
        s1.title = sc.nextLine();
        System.out.print("가수명입력: ");
        s1.singer = sc.nextLine();
        System.out.print("가격입력: ");
        s1.price = sc.nextInt();
        System.out.println();

        System.out.print("*Song 2*");
        System.out.print("곡명입력: " );
        sc.nextLine();
        s2.title = sc.nextLine();
        System.out.print("가수명입력: ");
        s2.singer = sc.nextLine();
        System.out.print("가격입력: ");
        s2.price = sc.nextInt();

        System.out.println("노래를 고르세요");
        System.out.println("1:" + s1.title + " 2:" + s2.title);
        int n = sc.nextInt();

        if( n == 1){
            s1.play();
            s1.price();
        } else if (n == 2) {
            s2.play();
            s2.price();
        }

        System.out.println("감사합니다.");

        sc.close();
    }


}
