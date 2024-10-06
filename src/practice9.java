class Cylinder{
    private double height;
    private double radius;
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
            height = h;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
            radius = r;
    }

    public double surfaceArea(){
        return (2*Math.PI*radius*radius )+(2*Math.PI*radius*height);
    }
    public double Volume(){
        return Math.PI *radius*radius*height;
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
}

class rectangle{
    int length;
    int breath;

    public rectangle() {
        this.length = 4;
        this.breath = 5;
    }
    public int getLength(){
        return length;
    }
    public int getBreath(){
        return breath;
    }
    public rectangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }
}

class Sphere{
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }

    public double volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }
}


public class practice9 {
    public static void main(String[] args){
        // Problem 1
        Cylinder cy = new Cylinder(4,5);
//        cy.setHeight(4);
//        cy.setRadius(7);
//        System.out.println(cy.getHeight());
//        System.out.println(cy.getRadius());

        //Problem 2
//        System.out.println(cy.surfaceArea());
//        System.out.println(cy.Volume());


        //Problem 3
//        System.out.println(cy.getHeight());
//        System.out.println(cy.getRadius());

        //problem 4
//     rectangle rec = new rectangle(23,45);
//        System.out.println(rec.getLength());
//        System.out.println(rec.getBreath());

        //problem 5
        Sphere sp = new Sphere();
        sp.setRadius(34);
        System.out.println(sp.getRadius());
        System.out.println(sp.volume());
    }
}
