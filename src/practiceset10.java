// Problem 1
//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}
//
//class Cello extends Pen{
//    public void write(){
//        System.out.println("The Story is written by Pen");
//    }
//    public void refill(){
//        System.out.println("Pen need to be refill");
//    }
//    public void ChangeNib(){
//        System.out.println("Changing the nib");
//    }
//}

// Problem 2
//class Monkey {
//    public void jump(){
//        System.out.println("Jumping...");
//    }
//    public void bite(){
//        System.out.println("Biting...");
//    }
//}
//interface BasicAnimal{
//    void eat();
//    void sleep();
//}
//class Human1 extends Monkey implements BasicAnimal{
//    public void speak(){
//        System.out.println("Hello sir...");
//    }
//    public void eat(){
//        System.out.println("Eating...");
//    }
//    public void sleep(){
//        System.out.println("Sleeping...");
//    }
//}

//Problem 3
//abstract class Telephone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//class Smartphone1  extends Telephone{
//    public void ring(){
//        System.out.println("Ringing...");
//    }
//    public void lift(){
//        System.out.println("Lifting...");
//    }
//    public void disconnect(){
//        System.out.println("Disconnecting...");
//    }
//}

interface TvRemote{
  void on();
  void off();
}
interface SmartTvRemote extends TvRemote{
    void prev();
    void next();
}

class Tv implements TvRemote{
    public void on(){
        System.out.println("Switch on");
    }
    public void off(){
        System.out.println("Switch off");
    }
}
public class practiceset10 {
    public static void main(String[] args) {
        // Problem 1
//        Cello cello = new Cello();
//        cello.write();
//        cello.refill();
//        cello.ChangeNib();

        // Problem 2
//        Human1 hum = new Human1();
//        hum.eat();
//        hum.sleep();
//        hum.speak();
//        hum.bite();
//        hum.jump();

        // Problem 3
//        Telephone obj1 = new Smartphone1();
//        obj1.ring();
//        obj1.disconnect();
//        obj1.lift();

        // Problem 4
        Tv tv = new Tv();
        tv.on();
        tv.off();
    }
}
