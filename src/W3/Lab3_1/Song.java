package W3.Lab3_1;

public class Song {
    public String title;
    public String singer;
    public int price;

    public void price(){
        System.out.println(price + "원입니다.");
    }
    public void play(){
        System.out.println("노래들어요: \"" +  title +  "\"by" + singer);
    }
}
