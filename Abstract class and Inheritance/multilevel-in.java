class A{
    void showA(){
        System.out.println("In A");
    }
}
class B extends A{
    void showB(){
        System.out.println("In B");
    }
}
class C extends B{
    void showC(){
        System.out.println("In C");
    }
}
class MultilevelDemo{
    public static void main(String[] args){
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}