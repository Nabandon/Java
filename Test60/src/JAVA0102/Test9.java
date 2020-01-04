package JAVA0102;
class P{
    private String name="zhangsan";
    private int age=10;
    public void show() {
        System.out.println("woshi:" + name + "," + age);
    }
}
public class Test9 {
    public static void main(String[] args) {


        P person = new P();
        person.show();
    }
}
