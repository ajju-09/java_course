class Vehicle{
    public void go(){

    }
}
class Car extends Vehicle{
    @Override
    public void go(){
        System.out.println("The car is moving...");
    }
}
class Boat extends Vehicle{
    @Override
    public void go(){
        System.out.println("The boat is moving...");
    }
}
class Bicycle extends Vehicle{
    @Override
    public void go(){
        System.out.println("The bicycle is moving...");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bicycle bicycle = new Bicycle();

        Vehicle[] racers = {car, boat, bicycle};
        for (Vehicle v : racers){
            v.go();
        }
    }
}
