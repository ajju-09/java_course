import java.util.Scanner;
public class practiceset4 {
    public static void main(String[] args)
    {
        // problem 1
//        int a = 10;
//
//        if(a == 11)
//        {
//            System.out.println("I am 11");
//        }
//        else
//        {
//            System.out.println("I am not 11");
//        }

        // Problem 2
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//         int phy = s.nextInt();
//        System.out.println("Enter your marks in Chemistry");
//        int chem = s.nextInt();
//        System.out.println("Enter your marks in Mathematics");
//        int math = s.nextInt();
//
//        float avg = (phy+chem+math)/3.0f;
//
//        if(avg >= 40 && phy >= 33 && chem >= 33 && math >= 33)
//        {
//            System.out.println("Congrats you passed");
//        }
//        else
//        {
//            System.out.println("Sorry you failed");
//        }

        // Problem 3
//            float income = 14f;
//            float tax = 0;
//
//            if(income < 2.5f)
//            {
//                tax = tax + 0;
//            }
//            else if(income > 2.5f && income < 5.0f)
//            {
//                tax = tax + 0.05f * (income - 2.5f);
//            }
//            else if(income > 5f && income < 10f)
//            {
//                tax = tax + 0.05f * (5.0f - 2.5f);
//                tax = tax + 0.2f * (income - 5f);
//            }
//            else if(income > 10f)
//            {
//                tax = tax + 0.05f * (5.0f - 2.5f);
//                tax = tax + 0.05f * (10.0f - 2.5f);
//                tax = tax + 0.3f * (income - 10.0f);
//            }
//        System.out.println(tax);

        // Problem 4
//        System.out.println("Enter number for days (Ex : Monday = 1 and so on");
//        Scanner sc = new Scanner(System.in);
//        int days = sc.nextInt();
//        switch (days)
//        {
//            case 1 -> System.out.println("Today is Monday");
//            case 2 -> System.out.println("Today is Tuesday");
//            case 3 -> System.out.println("Today is Wednesday");
//            case 4 -> System.out.println("Today is Thursday");
//            case 5 -> System.out.println("Today is Friday");
//            case 6 -> System.out.println("Today is Saturday");
//            case 7 -> System.out.println("Today is Sunday");
//
//        }

        // Problem 5
//        System.out.println("Enter number of days in a year");
//        Scanner sc = new Scanner(System.in);
//        int days = sc.nextInt();
//
//        if(days == 365)
//        {
//            System.out.println("The year is not a Leap year");
//        }
//        else if (days == 366)
//        {
//            System.out.println("The year is Leap year");
//        }
//        else
//        {
//            System.out.println("Enter days in 365 or 366");
//        }

        //problem 5
        System.out.println("Enter website");
        Scanner sc = new Scanner(System.in);
        String website = sc.nextLine();

        if(website.endsWith(".com"))
        {
            System.out.println("The website is Commercial ");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println("The website is Organizational");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("The website is Indian");
        }
    }
}
