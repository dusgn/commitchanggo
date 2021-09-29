package me.dusgn.chapter07;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println(p.x);
        p.method();

        System.out.println(c.x);
        c.method();

        /*
        * 100
        x =200
        super.x = 100
        this.x = 200
        200
        x =200
        super.x = 100
        this.x = 200
                * */
    }
}
class Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}
class Child3 extends Parent3 {
    int x = 200;

    void method() {
        System.out.println("x =" + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}