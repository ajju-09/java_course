//class A{
//    int x;
//    public int getX(){
//        return x;
//    }
//    public void setX(int x){
//        this.x =x;
//    }
//}
//
//class B extends A {
//    int y;
//    public int getY(){
//        return y;
//    }
//    public void setY(int y){
//        this.y = y;
//    }
//}

import java.io.DataOutput;

class Animal{
    String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
class Dog extends Animal{
    String Cato;

    public String getCato(){
        return Cato;
    }
    public void setCato(String cato){
        this.Cato = cato;
    }
}
class Cat extends Animal{

}
public class inheritance {
    public static void main(String[] args){
//        A a = new A();
//        a.setX(45);
//        System.out.println(a.getx());

//        B b = new B();
//        b.setX(4);
//        b.setY(3);
//        System.out.println(b.getX());
//        System.out.println(b.getY());

        Dog d = new Dog();
        d.setName("CHICHI");
        System.out.println(d.getName());

        d.setCato("Hussky");
        System.out.println(d.getCato());
    }
}
