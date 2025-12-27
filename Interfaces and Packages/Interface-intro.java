interface shape{
    void draw();
    void color();
}
class circle implements shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
    public void color(){
        System.out.println("Coloring Circle as red");
    }
}
class square implements shape{
    public void draw(){
        System.out.println("Drawing square");
    }
    public void color(){
        System.out.println("Coloring square as yellow");
    }
}
public class interface_intro {
    public static void main(String[] args){
        shape C = new circle();         //Dynamic method dispatch
        shape S = new square();
        C.draw();
        S.draw();
        C.color();
        S.color();
    }
}