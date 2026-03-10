package W4;

import java.util.Scanner;

public class W4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*Song 정보");
        System.out.println("곡명: ");
        String title = sc.nextLine();
        while (title.isEmpty()){
            System.out.println("곡명은 반드시 필요합니다.");
            System.out.println("곡명: ");
            title = sc.nextLine();
        }

        System.out.println("가수명: ");
        String singer = sc.nextLine();
        System.out.println("가격: ");
        int price = sc.nextInt();
        System.out.println("몇번 들으시겠습니까?");
        int num = sc.nextInt();
        int totalPrice = num * price;

        if(singer.equals("")){
            Song s1 = new Song(title,price);
            for(int i = 0; i < num; i ++){
                s1.play();
            }

        }else {
            Song s1 = new Song(title, singer, price);
            for(int i = 0; i < num; i ++){
                s1.play();

            }
        }


        System.out.println("총 " + totalPrice + "원 입니다.");



    }
}

class Song{
    public String title;
    public String singer;
    public int price;

    Song(){

    }
    Song(String title, int price){
        this.title = title;
        this.singer = "모름";
        this.price = price;

    }
    Song(String title, String singer, int price){
        this.title = title;
        this.singer = singer;
        this.price = price;
    }

    public void play(){
        System.out.println(title + " by " + singer + " 가격 :" + price);
    }
}
