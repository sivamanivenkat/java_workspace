package nonstaticinner;

public class Outer {
    static void f1(){
        System.out.println("Inside outer class!!");
    }

    class Inner{
        void f2(){
            System.out.println("Inside Non-static inner class");
        }
    }

    public static void main(String[] args) {
        Outer.f1();

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.f2();
    }
}
