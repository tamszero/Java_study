/*package W6;

public class Lab6_7 {
    public static void main(String[] args) {
        Buyer Buyer1 = new Buyer();
        Product pd[] = new Product[3];

        pd[0] = new Tv();
        pd[1] = new Computer();
        pd[2] = new Audio();

        for (int i=0; i < 3; i++){
            Buyer1.buy(pd[i]);
            System.out.println(pd[i]);
            System.out.println("Cost: " + pd[i].price);

        }
        System.out.println("\nMoney left: " +Buyer1.money);
        System.out.println("Current bonus point: " + Buyer1.bonusPoint);

    }
}

class Product{
    int price;
    int bonusPoint;
    Product(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product{
    Computer(){
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product pd){
        if(pd.price > money){
            System.out.println("Money is no enough. \n");
            System.exit(0);
        }
        money = money - pd.price;
        bonusPoint = bonusPoint + pd.bonusPoint;
    }
}
*/

