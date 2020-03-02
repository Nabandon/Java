package Test100;

public class Bird extends Anaimal {
    public Bird (String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}
