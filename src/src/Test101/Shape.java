package Test101;

public class Shape {
    public void draw(){

    }
}
class Cycle extends Shape{
    @Override
    public void draw(){
        System.out.println("o");
    }
}
class Rect extends Shape{
    @Override
    public void draw(){
        System.out.println("口");
    }
}
class Flower extends Shape{
    @Override
    public void draw(){
        System.out.println("❀");
    }
}
class Test1{
    public static void main(String[] args) {
        Shape shape=new Cycle();
                shape.draw();
              shape=new Flower();
                shape.draw();
              shape=new Rect();
                shape.draw();
    }
}


