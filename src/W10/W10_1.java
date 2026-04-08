package W10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class W10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        List<Student> studentList = new ArrayList<Student>();

        System.out.println("Input Student Name, ID, and age. 0 for name to quit.");
        while (true) {
            String name = sc.next();
            if(name.equals("0"))
                break;

            String ID = sc.next();
            int age = sc.nextInt();

            studentList.add(new Student(name, ID, age));

        }



        System.out.println(String.format("%-5s %-15s %-15s %-5s", "No.", "Name", "ID", "Age"));
        int i = 1;
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()){
            System.out.println(String.format("%-5d", i++) + it.next());
        }

        while (true){
            System.out.println("Choose the operation you want.");
            System.out.println("1.add information 2.delete information 3.show list 4.Finish program");
            int n = sc.nextInt();

            if(n == 1){
                addStudent(studentList);
            }else if (n == 2){
                deleteStrudent(studentList);
            }else if (n == 3){
                printResult(studentList);
            } else if (n == 4) {
                exit(0);
            }else {
                System.out.println("Wrong input");
            }

        }


    }
    public static void printResult(List<Student> studentList){

        int i = 1;
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()){
            System.out.println(String.format("%-5d", i++) + it.next());
        }

    }
    public static void deleteStrudent(List<Student> studentList){



        System.out.println("Input Student Number to delete.");

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt() - 1;

        studentList.remove(index);
        printResult(studentList);



    }
    public static void addStudent(List<Student> studentList){

        System.out.println("Input new Student Name, ID, and age, and the location");

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String ID = sc.next();
        int age = sc.nextInt();
        int index = sc.nextInt() - 1;

        studentList.add(index, new Student(name, ID, age));

        printResult(studentList);

    }

}

class Student{
    String name;
    String ID;
    int age;

    Student(){}
    Student(String name, String ID, int age){
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String toString(){
        return String.format("%-15s %-15s %-5d", name, ID, age);
    }
}
