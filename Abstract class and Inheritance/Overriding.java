class animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class dog extends animal {
    @Override 
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args){
        animal myAnimal = new dog(); //Dynamic method dispatch
        myAnimal.sound();
    }
}