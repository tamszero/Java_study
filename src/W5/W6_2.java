package W5;

import javax.swing.plaf.synth.SynthMenuBarUI;
import java.util.Scanner;

public class W6_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Emergency emergency = new Emergency();
        Ambulance ambulance = new Ambulance();
        FireEngine fireEngine = new FireEngine();
        PoliceCar policeCar = new PoliceCar();

        int num;

        do{
            System.out.println("Wjat kind of Emergency?");
            System.out.println("1.Fire 2.Patient 3.Thief 4.Record 5.End");

            num = sc.nextInt();


            switch (num){
                case 1:
                    emergency.EM_Call(fireEngine);
                    break;
                case 2:
                    emergency.EM_Call(ambulance);
                    break;
                case 3:
                    emergency.EM_Call(policeCar);
                    break;
                case 4:
                    emergency.EM_record();
                    break;
                case 5:
                    System.out.println("Finished");
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;

            }



        }while (num == 1 || num ==2 || num == 3 || num == 4);


    }
}

class Car{
    private String emgType;
    private int number;
    private String carType;
    private String reqPerson;

    Car(){
    }

    Car(String emgType, int number, String carType, String reqPerson){
        this.emgType = emgType;
        this.number = number;
        this.carType = carType;
        this.reqPerson = reqPerson;
    }

    public String getEmgType(){
        return emgType;
    }

    public int getNumber(){
        return number;
    }

    public String getCarType(){
        return carType;
    }

    public String getReqPerson(){
        return reqPerson;
    }

    //각 필드를 폭을 맞춰 출력하기 위한 포맷팅
    public String getStr(){
        return String.format("%-15s %-10d %-15s %-15s", getEmgType(), getNumber(), getCarType(), getReqPerson());
    }

    public void setEmgType(){
    }
    public void setNumber(){
    }
    public void setCarType(){
    }
    public void setReqPerson(){
    }

}

class Emergency{
    Car emgList[] = new Car[10];
    int i = 0;

    public void EM_Call(Car c){
        if(c.getNumber() == 112){
            System.out.println("Call 112");
        }else System.out.println("Call 119");

        //배열에 인스턴스 추가
        emgList[i++]= c;

    }

    public void EM_record(){
        System.out.printf("%-15s %-10s %-15s %-15s\n", "Emergency Type", "Number", "Car Type", "Required Person");
        for(int j = 0; j < i; j++){
            if(emgList[j] != null){
                System.out.println(emgList[j].getStr());
            }
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

class  Ambulance extends Car{
    Ambulance(){
        super("Patient", 119, "Ambulance", "Doctor");
    }
    public String toString(){
        return getStr();
    }

}

class PoliceCar extends Car{
    PoliceCar(){
        super("Thief", 112, "PoliceCar", "PoliceOfficer");

    }
    public String toString(){
        return getStr();
    }

}
