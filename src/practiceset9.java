//class Circle{
//    public int radius;
//    public Circle(int r){
//        System.out.println("I am constructor of circle");
//        this.radius = r;
//    }
//    public double area(){
//            return Math.PI*this.radius*this.radius;
//    }
//}
//class Cylinder1 extends Circle{
//    public int height;
//   public Cylinder1(int r, int h){
//       super(r);
//        System.out.println("I am a constructor of Cylinder");
//        this.height = h;
//    }
//    public double volume(){
//        return Math.PI*this.radius*this.radius*this.height;
//    }
//}

class Rect{
    int length;
    int breath;
//    Rect(int l, int b){
//        this.length = l;
//        this.breath = b;
//        System.out.println("I am a constructor of rectangle");
//    }
    public double area(){
        return length*breath;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }
}

class Cuboid extends Rect{
    int height;
//    Cuboid(int l, int b, int h){
//        super(l,b);
//        this.height = h;
//        System.out.println("i am constructor of cuboid");
//    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double volume(){
        return length*breath*height;
    }
}
public class practiceset9 {
    public static void main(String[] args){
        // Problem 1
//        Cylinder1 cyl = new Cylinder1(34,56);
        //problem 2
//        Rectangle rec = new Rectangle(4,5);
        Cuboid cube = new Cuboid();
        cube.setHeight(45);
        cube.setBreath(34);
        cube.setLength(12);
        System.out.println("The volume of cuboid is "+cube.volume());
        System.out.println("The area of rectangle is "+cube.area());

    }

}
