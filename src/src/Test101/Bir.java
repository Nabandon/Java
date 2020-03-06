package Test101;

public class Bir extends An {
    public Bir(String name){
        super(name);
    }
    public void eat(String food){
        System.out.println("我是b");
        System.out.println("b在吃"+food);
    }
    public void fly(){
        System.out.println(this.name+"f飞");
    }
}
