package Test101;

public class Cat extends Animal implements Irunning {
    public Cat(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name+"PAO");
    }
}
