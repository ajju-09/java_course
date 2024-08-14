class Employee1{
    private int id;
    private String Name;
    public String getName(){
        return Name;
    }
    public void setName(String n){
        Name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}
public class Access_modifier {
    public static void main(String[] args){
    Employee1 emp1 = new Employee1();
    emp1.setId(1234);
    emp1.setName("Jugal");
        System.out.println(emp1.getId());
        System.out.println(emp1.getName());
    }
}
