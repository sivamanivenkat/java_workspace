package staticInner;

public class Outer {
    void f1(){
        System.out.println("Non static method Inside outer class!!");
    }

    static class Inner{
        void f2(){
            System.out.println("Non static method Inside inner class..");
        }

        static void f3(){
            System.out.println("Static method inside Inner class");
        }
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.f1();

        Outer.Inner oi = new Outer.Inner();
        oi.f2();

        Outer.Inner.f3();
    }
}
