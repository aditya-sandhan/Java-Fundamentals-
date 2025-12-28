class MyTask implements Runnable{       // implementing Runnable interface
    public void run(){
        System.out.println("My task is running");
    }
}
class TestRunnable{
    public static void main(String[] args){
        MyTask obj = new MyTask();      //creating object of mytask class
        Thread t = new Thread(obj);     //creating thread object and passing mytask class object
        t.start();    // creates new thread memory and calls run() automatically internally
    }
}