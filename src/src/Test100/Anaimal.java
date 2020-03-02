package Test100;

public class Anaimal {
    protected String name;
    public Anaimal(String name){
        this.name=name;
    }
        public void eat(String food){
            System.out.println("wo shi yizhi xiao dong wu");
            System.out.println(this.name+"正在吃"+food);

    }
}
