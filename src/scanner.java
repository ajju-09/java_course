import java.sql.SQLOutput;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int a = s.nextInt();
        System.out.println("Enter number 2 :");
        int b = s.nextInt();
        int sum = a+b;
        boolean b1 = s.hasNextInt();
        System.out.println(b1);
        System.out.println("The sum of two number is "+sum);
        java.lang.String name = s.nextLine();
        System.out.println(name);
    }
}
