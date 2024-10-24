class MyRunnableThread1 implements Runnable{
    public void run() {
        int i = 0;
        while (i < 400) {
            System.out.println("I am a Runnable thread in 1");
            i++;
        }
    }
}
class MyRunnableThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("I am a Runnable thread in 2");
            i++;
        }
    }
}

public class Runnable_Thread {
    public static void main(String[] args) {
        MyRunnableThread1 rt1 = new MyRunnableThread1();
        Thread t1 = new Thread(rt1);

        MyRunnableThread2 rt2 = new MyRunnableThread2();
        Thread t2 = new Thread(rt2);

        t1.start();
        t2.start();
    }
}
