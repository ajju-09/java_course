import javax.xml.transform.Source;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return super.toString()+ " I am a toString";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am a getMessage";
    }
}
public class exception1_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a = sc.nextInt();
        if (a < 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
