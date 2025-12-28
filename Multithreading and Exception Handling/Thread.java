class Mythread extends Thread{      //extending Thread class
    public void run(){          
        System.out.println("My thread is running");
    }
}

class TestThreadApp {
    public static void main(String[] args){
        Mythread t = new Mythread(); //creating thread object
        t.start();
    }
}