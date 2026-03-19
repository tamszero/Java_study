package W6;

public class Lab6_4 {
    public static void main(String[] args) {

        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x);
        p.method(); //자손에서 오버라이딩 된 메서드가 실행됨
        System.out.println("c.x = " + c.x);
        c.method();

    }
}

class Parent{
    int x = 100;

    void method(){
        System.out.println("Parent.Method");
    }
}

class Child extends Parent{
    int x = 200;

    void method(){
        System.out.println("Child method");
    }
}