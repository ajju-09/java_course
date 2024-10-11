import java.util.Scanner;
// Problem 1
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

// Problem 2
class  cellPhone{
    String ring;
    String vibrate;

    public String getRing(){
        return ring;
    }

    public String getVibrate(){
        return vibrate;
    }
}

// Problem 3
class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

//Problem 4
class tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void fire(){
        System.out.println("Firring on enemy");
    }
    public void run(){
        System.out.println("Running towards enemy");
    }
}

public class practiceset8 {
    public static void main(String[] args){
//            Employee Jugal = new Employee();
//            Jugal.setName("Harshuu");
//            Jugal.salary = 300000;
//        System.out.println("The salary ="+Jugal.getSalary());
//        System.out.println(Jugal.getName());

//        cellPhone apple = new cellPhone();
//        apple.ring = "Ringing.....";
//        apple.vibrate = "Vibrating.....";
//        System.out.println(apple.getRing());
//        System.out.println(apple.getVibrate());

//        Square num = new Square();
//        num.side = 4;
//        System.out.println(num.area());
//        System.out.println(num.perimeter());

        tommy player1 = new tommy();
        player1.fire();
        player1.hit();
        player1.run();
    }
}
