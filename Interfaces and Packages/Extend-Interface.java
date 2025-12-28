interface A{
    void methodA();
}

interface B{
    void methodB();
}

interface C extends A,B{           //Multiple inheritance using interfaces
    void methodC();
}

class demo implements C{
    public void methodA(){
        System.out.println("Implementation of methodA from interface A");
    }
    public void methodB(){
        System.out.println("Implementation of methodB from interface B");
    }
    public void methodC(){
        System.out.println("Implementation of methodC from interface C");
    }
}
class MainDemo {
    public static void main(String[] args){
        demo obj = new demo();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}