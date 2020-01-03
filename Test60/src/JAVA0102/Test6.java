package JAVA0102;
class Test6 {
    public static void main(String[] args) {
        Person1 person=new Person1();
        person.show();
    }

}
class Person1{
    public int age=10;
    public String name="zhangsan";
    public void show(){
        System.out.println("my name is "+name+","+age+"岁");
    }
}
