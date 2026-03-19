package W6;

import java.util.Scanner;

import static java.lang.System.exit;

public class W6_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Emergency e = new Emergency();
        FireEngine fe = new FireEngine();
        Ambulance ab = new Ambulance();
        PoliceCar pc = new PoliceCar();

        System.out.println("What Kind of Emergency?");
        int num = sc.nextInt();
        if(num == 1){
            e.EM_Call(fe);
        } else if (num == 2) {
            e.EM_Call(ab);
        } else if (num == 3) {
            e.EM_Call(pc);
        } else if (num == 4) {
            e.EM_record();

        }else {
            exit(0);
        }


    }
}

class Car{
    private String emgType;
    private int number;
    protected String carType;
    private String reqPerson;

    //생성자를통해 초기값 대입
    Car(){

    }
    Car(String emgType, int number, String CarType, String reqPerson){
        this.emgType = emgType;
        this.number = number;
        this.carType = CarType;
        this.reqPerson = reqPerson;
    }

    public String getEmgType(){
        return emgType;
    }
    public int getNumber(){
        return number;
    }
    public String getReqPerson(){
        return reqPerson;
    }
    public String getCarType(){
        return carType;
    }

    public String getStr(){
        return getEmgType() + getNumber() + getCarType() + getReqPerson();
    }
}

class Emergency{
    //Car타입의 참조변수 배열 선언(최대10개)
    Car emgList[] = new Car[10];
    int i = 0;

    public void EM_Call(Car c){
        if(c.getNumber() == 119){
            System.out.println("Call 119");;
        }else {
            System.out.println("Call 112");
        }

        emgList[i++] = c;

    }
    public void EM_record(){
        for (int j =0; j < i; j++){
            System.out.println(emgList[j].getStr());
        }

    }
}

class FireEngine extends Car{

    FireEngine(){
        super("Fire", 119, "FireEngine", "FireFighter");
    }
    public String toString(){
        return getStr();
    }

}
class Ambulance extends Car{

    Ambulance(){
        super("Patient", 119, "Ambulance", "Doctor");
    }
    public String toString(){
        return getStr();
    }

}
class PoliceCar extends Car{

    PoliceCar(){
        super("Thief", 112, "PoliceCar","PoliceOfficer");
    }
    public String toString(){
        return getStr();
    }

}