package localinner;

public class Outer {
    public void f1(){
        System.out.println("Inside Outer class!!");

        class LocalInner{
            public void f2(){
                System.out.println("Inside Local Inner Class..");
            }
        }
        LocalInner inner = new LocalInner();
        inner.f2();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.f1();
    }
}
