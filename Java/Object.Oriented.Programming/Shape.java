abstract class AnyShape{
    abstract void draw();
}
class Circle extends AnyShape{
    void draw(){
        System.out.println("drawing circle.");
    }
}
class Rectangle extends AnyShape{
    void draw(){
        System.out.println("drawing Rectangle.");
    }
}
public class Shape {

    public static void main(String[] args) {
        AnyShape shape= new Circle();
        shape.draw();
    }
}
