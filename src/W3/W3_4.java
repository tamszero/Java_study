package W3;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class W3_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuOrder mo = new MenuOrder();

        String answer;

        System.out.println("--- 음료 가격 설정 ---");
        System.out.print("Coke가격: ");
        mo.setPrice("Coke", sc.nextInt());
        System.out.print("Lemonade가격: ");
        mo.setPrice("Lemonade", sc.nextInt());
        System.out.print("Coffee가격: ");
        mo.setPrice("Coffee", sc.nextInt());

        do{
            System.out.println("--- 돈을 넣으세요 ---");
            mo.setInputMoney(sc.nextInt());

            System.out.println("--- 음료를 선택하세요 ---");
            mo.showMenu();
            mo.showResult(sc.nextInt());

            System.out.println("계속 하시겠습니까? (y/n)");
            answer = sc.nextLine();
        }while (answer.equalsIgnoreCase("y"));

        sc.close();
    }
}

class MenuOrder{
    private int cokePrice;
    private int lemonadePRice;
    private int coffeePrice;
    private int inputMoney;
    private String drinkSelected;


    public void setInputMoney(int inputmoney){
        this.inputMoney = inputmoney;
    }
    public void setPrice(String select, int price){
        this.drinkSelected = select;
        if(drinkSelected.equals("Coke")){
            this.cokePrice = price;
        }else if(drinkSelected.equals("Lemonade")){
            this.lemonadePRice = price;
        }else if(drinkSelected.equals("Coffee")){
            this.coffeePrice = price;
        }
    }

    public void showMenu(){
        System.out.println("1. Coke: " + this.cokePrice);
        System.out.println("2. Lemonade: " + this.lemonadePRice);
        System.out.println("3. Coffee: " + this.coffeePrice);


    }

    public void showResult(int n){

        if(n == 1){
            System.out.println("Coke를 선택하셨습니다.");
            if(cokePrice <= inputMoney){
                System.out.println("잔돈은 " + (inputMoney - cokePrice) + "입니다");
            }else if(cokePrice > inputMoney){
                System.out.println((cokePrice - inputMoney) + "원 더 넣어주세요");
            }
        } else if (n == 2) {
            System.out.println("Lemonade를 선택하셨습니다.");
            if(lemonadePRice <= inputMoney){
                System.out.println("잔돈은 " + (inputMoney - lemonadePRice) + "입니다");
            } else if (lemonadePRice > inputMoney) {
                System.out.println((lemonadePRice - inputMoney) + "원 더 넣어주세요");
            }

        }else {
            System.out.println("Lemonade를 선택하셨습니다.");
            if(cokePrice <= inputMoney){
                System.out.println("잔돈은 " + (inputMoney - coffeePrice) + "입니다");
            } else if (coffeePrice > inputMoney) {
                System.out.println((coffeePrice - inputMoney) + "원 더 넣어주세요");
            }
        }

    }
}
