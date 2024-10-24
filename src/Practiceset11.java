//class Mythrd1 extends Thread{
//    @Override
//    public void run(){
//        int i=0;
//        while(i<400) {
//            try{
//                Thread.sleep(200);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//            System.out.println("Good Morning");
//            i++;
//        }
//    }
//}
//class Mythrd2 extends Thread{
//    @Override
//    public void run(){
//        int i=0;
//        while(i<400){
//            try{
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//        System.out.println("Welcome");
//        i++;
//    }
//    }
//}
//public class Practiceset11 {
//    public static void main(String[] args) {
//        // Problem 1
//        Mythrd1 t1 = new Mythrd1();
//        Mythrd2 t2 = new Mythrd2();
////        t1.setPriority(6);
////        t2.setPriority(3);
//        System.out.println(t1.getPriority());
//        System.out.println(t2.getPriority());
//        System.out.println(t2.getState());
//        System.out.println(t2.currentThread().getState());
////        t1.start();
////        t2.start();
//    }
//}
