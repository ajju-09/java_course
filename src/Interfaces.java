 interface Prey{
    void flee();
}
interface Predator{
    void hunt();
    private void walk(){  // Private method is use in interface to reduce length of default method
        System.out.println("The Rabbit is walking...");
    }
    default void run(){  // We can use default methods when we forget to implement it in class
        walk();
        System.out.println("The Rabbit is running...");
    }
}
class Rabbit implements Prey{
   public  void flee(){
        System.out.println("The rabbit is fleeing...");
    }
}

class Hawk implements Predator{
    public void hunt(){
        System.out.println("The Hawk is hunting...");
    }
}

class Fish implements Prey,Predator{

    public void flee(){
        System.out.println("This fish is fleeing....");
    }
    public void hunt(){
        System.out.println("This fish is hunting....");
    }
}
public class Interfaces {
    public static void main(String[] args) {
//        Rabbit rabbit = new Rabbit();
//        rabbit.flee();
//
        Hawk hawk = new Hawk();
        hawk.hunt();
        hawk.run();

//        Fish fish = new Fish();
//        fish.flee();
//        fish.hunt();
    }
}
