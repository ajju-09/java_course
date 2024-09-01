class myThread1 extends Thread{
    int i=0;
    @Override
    public void run(){
        while(i<400){
            System.out.println("Sam is running.....");
            i++;
        }
    }
}
class myThread2 extends Thread{
    int i=0;
    @Override
    public void run(){
        while(i<400){
            System.out.println("Sam is eating.....");
            i++;
        }
    }
}
public class Extend_thread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
     }
}
