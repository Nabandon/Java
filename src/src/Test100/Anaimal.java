package Test100;

public class Anaimal {
    public String name;
    public Anaimal(String name){
        this.name=name;
    }
    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }
}
