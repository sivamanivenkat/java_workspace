package accessoutermembers;

public class Outer {
    private static int a = 5;
    private int b;

    public Outer(int b){
        this.b = b;
    }
    public void f1(){
        System.out.println("From Outer, a : " + a + " b : "+b);
    }

    class Inner{
        private int b;
        public Inner(int b){
            this.b = b;
        }
        public void f2(){
            System.out.println("From Inner Class : " );
            System.out.println("Outer a : " + Outer.a);
            System.out.println("Outer b : " + Outer.this.b);
            System.out.println("Inner b : " + this.b);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer(10);
        outer.f1();

        Outer.Inner inner = outer.new Inner(20);
        inner.f2();
    }

}
