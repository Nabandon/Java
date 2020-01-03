package JAVA0102;

class TestDemo{
    public int a;
    public static int c;
}

public class Test7 {
    public static void main(String[] args) {
        TestDemo t1=new TestDemo();
        t1.a++;
        TestDemo.c++;
        System.out.println(t1.a);
        System.out.println(TestDemo.c);
        System.out.println("--------------");
        TestDemo t2=new TestDemo();
        t2.a++;
        TestDemo.c++;
        System.out.println(t2.a);
        System.out.println(TestDemo.c);
    }
}
