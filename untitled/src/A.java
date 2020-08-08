public class A {
    static {
        System.out.println("1");
    }
    public void A(){
        System.out.println("2");
    }
}
class B extends A{
    static {
        System.out.println("a");
    }
    public B(){
        System.out.println("b");
    }
}
class C{

    public static void main(String[] args) {
        A a = new B();
        Double D=0.6254;
        double d=0.6254;
        Float f=0.6254f;
        float f1=0.2554f;
    }
}

