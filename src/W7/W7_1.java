package W7;

import java.util.Scanner;

import static java.lang.System.exit;

public class W7_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dog d;
        Cat c;
        Bird b;
        Snake s;

        Pet petList[] = new Pet[10];
        int n;
        int i = 0;


        do{
            System.out.println("원하는 작업은 무엇입니까?");
            n = sc.nextInt();

            if(n == 1){
                System.out.println("종은 무엇입니까?");
                int sp = sc.nextInt();
                sc.nextLine();
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Age: ");
                int age = sc.nextInt();

                switch (sp){
                    case 1:
                        d = new Dog("Dog", name, age );
                        petList[i++] = d;
                        break;

                    case 2:
                        c = new Cat("Cat", name, age);
                        petList[i++] = c;
                        break;

                    case 3:
                        b = new Bird("Bird", name, age);
                        petList[i++] = b;
                        break;

                    case 4:
                        s = new Snake("Snake", name, age);
                        petList[i++] = s;
                        break;

                    default:
                        break;
                }


            } else if (n == 2) {
                //petList.length를 안 쓰는 이유는 아직 펫리스트 길이만큼 데이터가 안 채워져 있으면 null exception을 따로 처리해줘야하기때문에!!
                for (int j = 0; j<i; j++){
                    System.out.println(petList[j].species + petList[j].name + petList[j].age);
                }
            }else {
                System.out.println("종료");
                exit(0);
            }

        }while (n == 1 || n == 2);



    }
}


abstract class Pet{
    public String species;
    public String name;
    public  int age;


    public abstract void move();
        }


class Dog extends Pet{

    Dog(String species, String name, int age){
        super.species = species;
        super.name = name;
        super.age = age;
    }
    public void move(){
        System.out.println("run");
    }
}

class Cat extends Pet{

    Cat(String species, String name, int age){
        super.species = species;
        super.name = name;
        super.age = age;
    }
    public void move(){
        System.out.println("jump");
    }
}
class Bird extends Pet{

    Bird(String species, String name, int age){
        super.species = species;
        super.name = name;
        super.age = age;
    }
    public void move(){
        System.out.println("fly");
    }
}
class Snake extends Pet{

    Snake(String species, String name, int age){
        super.species = species;
        super.name = name;
        super.age = age;
    }
    public void move(){
        System.out.println("crawl");
    }
}