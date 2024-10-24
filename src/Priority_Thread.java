class MyThr1 extends Thread{
     public MyThr1(String name){
         super(name);
     }
     public void run(){
         int i =0;
         while(i<50){
             System.out.println(this.getName());
             i++;
         }
     }
}
public class Priority_Thread {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Sam1");
        MyThr1 t2 = new MyThr1("Sam2");
        MyThr1 t3 = new MyThr1("Sam3");
        MyThr1 t4 = new MyThr1("Sa4");
        MyThr1 t5 = new MyThr1("Sam5 (Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY); // Priority 10
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
