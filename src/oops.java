class Customer{
    int id;
    String name;
    int Income;
public void getDetails(){
        System.out.println("The id is "+id);
        System.out.println("The name is "+name);
    }
    public int getIncome(){
        return Income;
    }
}

public class oops {
    public static void main(String[] args){
       Customer store = new Customer();
       Customer store1 = new Customer();
       store.id = 12;
       store.Income = 40000;
       store.name = "Jugal";

       store1.id = 123;
       store1.Income = 30000;
       store1.name = "Harshuu";

        store.getDetails();
        store1.getDetails();

        int Income = store.getIncome();
        System.out.println(Income);

    }
}
