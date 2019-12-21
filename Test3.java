import java.io.*;
import java.util.Arrays;
import java.util.List;
public class FirstDemo{
    public static void main(String[] args) {
        int age = 2;
        String name="66";
        Dog dog=new Dog(name,age);
        int x=age-1;
        if(x>1){
            dog.play();

        }else{
            dog.brak();
        }int [] numList=new int[]{1,3,5,7,9};
        new Thread(()->System.out.println("hello world")).start();
        try{
            InputStream in=new FileInputStream(new File ("//xx.txt"));
        }catch(Exception e){
            e.printStackTrace();
        }
        List<Integer> list=Arrays.asList(1,2,2,4,5,6,7,10);
        list.stream()
        .filter(e->e%2==0)
        .distinct()
        .forEach(System.out::println);
    }
}
class Dog{
    private String name;
    private Integer age;
    public Dog(String name ,Integer age ){
        this.name=name;
        this.age=age;
    }
    public void play(){
System.out.println(this.name+"want to play");
    }
    public void bark(){
        System.out.println(this .name +"汪汪汪");
    }

}