interface vehicle{
    void drive();

    default void start(){                            //default method
        System.out.println("Vechicle is starting");  //Has body & can be overridden
    }

    static void showcompany(){                           //static method
        System.out.println("Vechicle company is BMW"); //Has body & cannot be overridden
    }
}

class car implements vehicle{
    public void drive(){
        System.out.println("Car is driving");
    }

    @Override
    public void start(){                             //Overriding default method
        System.out.println("Car is starting");
    }

    public static void main(String[] args){
        car c = new car();
        c.start();               //Calling overridden default method
        c.drive();
        vehicle.showcompany();             //Calling static method of interface
    }
}
