class Mythr extends Thread{
    public Mythr(String name) {
        super(name);
    }
    public void run(){
            System.out.println("I am a Thread");
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        Mythr thr = new Mythr("Sam");
        Thread thr1 = new Thread(thr, "Ram");
        thr1.start();
        System.out.println("Thread Id is "+thr1.getId());
        System.out.println("Thread Name is "+thr1.getName());
    }
}
