abstract class Shape{
    abstract void draw();
    void info(){
        System.out.println("All shapes have Boundries");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}
public class demo{
    public static void main(String[] args){
        Shape s;
        s = new Circle();
        s.draw();
        s= new square();
        s.draw();
    }
}