package JAVA0102;
class Person3{
    private int a=1;
    public Person3(){
        this.a=2;
    }
    public Person3(int a){
        this.a=a;
    }
    public void show(){
        System.out.println("a="+a);
    }
}
public class Test11 {
    public static void main(String[] args) {
        Person3 p3=new Person3();
        p3.show();
        Person3 p4=new Person3(3);
        p4.show();
    }

}
