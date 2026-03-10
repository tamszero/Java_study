package W4;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        Car c3 = new Car();

        c3 = c1;

        System.out.println("c1의 color: " + c1.color + ", gearType: " + c1.gearType + ", door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", gearType: " + c2.gearType + ", door: " + c2.door);
        System.out.println("c3의 color: " + c3.color + ", gearType: " + c3.gearType + ", door: " + c3.door);

        c1.door=100;
        System.out.println("c1.door=100;수행 후");
        System.out.println("c1의 color: " + c1.color + ", gearType: " + c1.gearType + ", door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", gearType: " + c2.gearType + ", door: " + c2.door);
        System.out.println("c3의 color: " + c3.color + ", gearType: " + c3.gearType + ", door: " + c3.door);


    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }
    Car(Car c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;

    }
}

/*
c3 =c1 -> 참조 복사이므로 서로 같은 객체를 가리킨다
new Car(c1) -> 값만 복사하고 서로 다른 객체를 가리킴
 */