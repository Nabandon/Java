package Test101;

public class Duck extends Animal implements Irunning,IFlying,Iswimming  {
    public Duck(String name){
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name+"pao");
    }

    @Override
    public void run() {
        System.out.println(this.name+"fei");
    }

    @Override
    public void swim() {
        System.out.println(this.name+"you");
    }
}
