/*package W6;

public class Lab6_6 {
    public static void main(String[] args) {

        Buyer Buyer1 = new Buyer();
        Product tv1 = new Tv();
        Product cp1 = new Computer();
        Product ad1 = new Audio();

        Buyer1.buy(tv1);
        Buyer1.buy(cp1);
        Buyer1.buy(ad1);

        System.out.println(tv1.toString());
        System.out.println("Cost:" + tv1.price);
        System.out.println(cp1.toString());
        System.out.println("Cost: " + cp1.price);
        System.out.println(ad1.toString());
        System.out.println("Cost:" + ad1.price);
        System.out.println("\nMoney left: " + Buyer1.money);
        System.out.println("Current bonus point: " + Buyer1.bonusPonint);

    }
}

class Product{
    int price;
    int bonuspoint;
    Product(int price){
        this.price = price;
        bonuspoint = (int)(price/10.0);
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
        super(100);
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
class Buyer{
    int money;
    int bonusPonint;

    void buy(Product pd){
        if(pd.price > money){
            System.out.println("Money is not enogh.\n");
            System.exit(0);
        }
        money = money - pd.price;
        bonusPonint = bonusPonint + pd.bonuspoint;
    }
}


*/