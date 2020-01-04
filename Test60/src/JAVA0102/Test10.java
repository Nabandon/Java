package JAVA0102;
class Person2{
    private String name="z";
    public void setName(String name){
        this.name=name;
    }
    public String getNmae(){
        return name;
    }
    public void show(){
    System.out.println("my "+name);
  }
}
public class Test10 {
    public static void main(String[] args) {
        Person2 P=new Person2();
        P.setName("wc");
        String name=P.getNmae();
        System.out.println(name);
        P.show();
    }
}
