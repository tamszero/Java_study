/*package W10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Fruit[] myFruit = new Fruit[10];

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        myFruit[0] = new Apple();
        myFruit[1] = new Grape();
        myFruit[2] = new Pear();
        myFruit[3] = new Pear();

        System.out.println("You have " + buyer.money + " won.");

        for(int i =0; i<4; i++){
            buyer.buy(myFruit[i]);
            System.out.println("\n<my Fruit_Basket>");
        }
        for(int i=0; i<4; i++){
            System.out.println(myFruit[i] + "(" + myFruit[i].price);
        }
        if(buyer.money < 0)
            System.out.println("You need to pay " + -buyer.money + "won more.");
        else
            System.out.println("Ypu have " + buyer.money + "won left.");
    }

}

class Fruit{
    int price;
    Fruit(int price){
        this.price = price;
    }
}
class Strawberry extends Fruit{
    Strawberry(){
        super(1000);
    }
    public String toString(){
        return "Strawberry";
    }
}
class Apple extends Fruit{
    Apple(){
        super(2000);
    }
    public String toString(){
        return "Apple";
    }
}
class Pear extends Fruit{
    Pear(){
        super(4000);
    }
    public String toString(){
        return "Pear";
    }
}
class Grape extends Fruit{
    Grape(){
        super(3500);
    }
    public String toString(){
        return "Grape";
    }
}
class Buyer{
    public Buyer(int money){
        this.money = money;
    }

    ArrayList <Fruit>myFruit = new ArrayList<Fruit>();
    int money;

    void buy(Fruit f){
        myFruit.add(f);
        money = money - f.price;
    }
    void pay(){
        System.out.println("\n<My Fruit Basket>");
        for(int j = 0; j < myFruit.size(); j++){
            System.out.println(myFruit.get(j) + "(" +myFruit.get(j).price);
        }

        if(money < 0)
            System.out.println("You need to pay more");
        else
            System.out.println("You have " +money+ "won left");
    }
}

 */