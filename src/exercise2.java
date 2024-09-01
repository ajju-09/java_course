import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class exercise2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Press 0 for rock\nPress 1 for paper\nPress 2 for scissor\n");
        System.out.print("Enter your choice :");
        int user = sc.nextInt();

        System.out.println();
        if (user == 0){
            System.out.println("Computer choice : Rock");
        }
        else if (user == 1){
            System.out.println("Computer choice : Paper");
        }
        else if (user == 2){
            System.out.println("Computer choice : Scissor");
        }

        Random rand = new Random();
        int computer = rand.nextInt(3);

        if(user == computer){
            System.out.println("DRAW");
        }
        else if (user == 0 && computer == 2 || user == 1 && computer == 0|| user == 2 && computer == 1 ){
            System.out.println("YOU WON");
        }else{
            System.out.println("COMPUTER WIN");
    }
        if (computer == 0){
            System.out.println("Computer choice : Rock");
        }
        else if (computer == 1){
            System.out.println("Computer choice : Paper");
        }
        else if (computer == 2){
            System.out.println("Computer choice : Scissor");
        }
    }
}
