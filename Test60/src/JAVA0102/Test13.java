package JAVA0102;

public class Test13{
    private int count;
    public static void main(String[] args) {
        Test13 test=new Test13(88);
        System.out.println(test.count);
    }
    Test13(int a) {
        count=a;
    }
}
