//class name{
//    int er_no;
//    String fname;
//    int salary;
//
//    public name(int id, String name, int Salary){
//         er_no = id;
//         fname = name;
//         salary = Salary;
//    }
//}
//public class Consturctor {
//    public static void main(String[] args){
//        name n = new name(6002,"Ajju", 10000);
//        System.out.println(n.er_no);
//        System.out.println(n.fname);
//        System.out.println(n.salary);
//    }
//}
class Human{
    String name;
    int age;
    double weight;

     Human (String name, int age, double weigth){
        this.name = name;
        this.age = age;
        this.weight = weigth;
    }
}
public class Consturctor {
    public static void main(String[] args){
        Human human = new Human("Ajju", 20, 52);
        Human human1 = new Human("Jugal", 19, 30);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human1.name);

    }
}
