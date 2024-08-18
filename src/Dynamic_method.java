import java.sql.SQLOutput;

class Phone{
    public void ShowTime(){         // All methods which is present in Super class they all can run
        System.out.println("It's a 12 o'clock");
    }
    public void on(){
        System.out.println("Running in phone.....");
    }
}

class Smartphone extends Phone{
    public void on(){                       // if it is override method then Sub class method runs
        System.out.println("Running in Smart phone.....");
    }
    public void music(){                    // if it is not override then sub class method throws error
        System.out.println("Music is on");
    }
}
public class Dynamic_method {
    public static void main(String[] args){
        Phone obj = new Smartphone();
        obj.ShowTime();
        obj.on();
//        obj.music();
    }
}
