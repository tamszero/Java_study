package W8;

public class W8_1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4); //4는 출력이 안되고 바로catch 실행, 후 블록 나가서 6나옴
        }catch (ArithmeticException e){
            System.out.println(5);
        }
        System.out.println(6);
    }
}
