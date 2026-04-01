package W9;

import java.io.*;
import java.util.Scanner;

public class W9_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dog[] myDog = new Dog[10];

        myDog[0] = new Dog("Merry", 3, 2.5, "Bulldog", false);
        myDog[1] = new Dog("JJong", 5, 5.5, "Mix", false);
        myDog[2] = new Dog("Kong", 4, 3, "Poodle", true);
        myDog[3] = new Dog("Apple", 2, 2.5, "Collie", true);
        myDog[4] = new Dog("Candy", 5, 5.5, "Coca", false);
        myDog[5] = new Dog("Cutie", 7, 2.5, "Chiwawa", true);
        myDog[6] = new Dog("Peace", 3, 2.5, "Huskey", false);
        myDog[7] = new Dog("Lion", 9, 1.5, "Shepard", true);
        myDog[8] = new Dog("Windy", 2, 9, "Jindo", true);
        myDog[9] = new Dog("Sweetie", 1, 2.5, "Maltiz", false);

        System.out.println("Input File name to write Dog data");
        String fileName = sc.nextLine();
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            System.out.printf("%-10s %3s %5s %10s %s", "Name","Age","Weight","Breed", "BoosterShot");
            System.out.printf("\n");
            for(int i = 0; i < myDog.length; i++){
                System.out.println(myDog[i].toString());
                outputStream.writeObject(myDog[i]);
            }

            outputStream.close();

            try {
                ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
                int i = 0;

                try {
                    while (true) {
                        myDog[i++] = (Dog) inputStream.readObject();
                    }
                }catch (EOFException e){
                    System.out.println("EOF.");
                }
                System.out.println("Dogs older than 2 years and didn't get the boostershot.");


                //for문을 돌고 새로운 변수 j를 써줘야함!!
                for(int j = 0; j < i; j++){
                    if(myDog[j].getOX().equals("X") && myDog[j].getAge() >= 2){
                        System.out.printf("%-10s %-10s", myDog[j].getName(), myDog[j].getBreed());
                        System.out.println("");
                    }
                }

                inputStream.close();

            }catch (ClassNotFoundException e){
                System.out.println("class Not Found");
            }catch (FileNotFoundException e){
                System.out.println("File not Found");
            }


        }catch (IOException e){
            System.out.println("There is an Error with this file");
        }


    }
}

class Pet implements Serializable {
    private String name;
    private int age;
    private  double weight;

    Pet(){

    }

    Pet(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setPet(String newName, int newAge, double newWeight){
    }

    public void setName(String newName){

    }
    public void setAge(int newAge){

    }
    public  void setWeight(double newWeight){

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
}

class Dog extends Pet implements Serializable{
    private String breed;
    private boolean boosterShot;

    Dog(){
    }

    Dog(String name,int age, double weight, String breed, boolean boosterShot){
       super(name, age, weight);
        this.breed = breed;
        this.boosterShot = boosterShot;
    }
    public void setBreed(String breed){

    }
    public void setBoosterShot(boolean boosterShot){

    }
    public String getBreed(){
        return breed;
    }
    public boolean getBoosterShot(){
        return boosterShot;
    }

    public String getOX(){
        if(getBoosterShot() == false){
            return "X";
        }else return "O";
    }

    public String toString(){
        return String.format("%-10s %3s %5s %10s %10s", getName(),getAge(),getWeight(),getBreed(),getOX());
    }
}
