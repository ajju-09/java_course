import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args)
    {
        System.out.println("Enter your marks out of 100 here");
        System.out.println("Enter your Physics marks");
        Scanner s = new Scanner(System.in);
        int phy = s.nextInt();
        System.out.println("Enter your Chemistry marks");
        int chem = s.nextInt();
        System.out.println("Enter your English marks");
        int eng = s.nextInt();
        System.out.println("Enter your Mathematics marks");
        int math = s.nextInt();
        System.out.println("Enter your Biology marks");
        int bio = s.nextInt();
        System.out.println("Your Physics marks is :"+phy);
        System.out.println("Your Chemistry marks is :"+chem);
        System.out.println("Your English marks is :"+eng);
        System.out.println("Your Mathematics marks is :"+math);
        System.out.println("Your biology marks is :"+bio);

        float result ;
        int total;
        total = phy+chem+eng+math+bio;
          result = total*100/500f;
        System.out.println("Your percentage is "+result);
    }
}
