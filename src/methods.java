import java.util.Scanner;

public class methods {
    static int add(int x, int y){
        int z;
        z = x+y;
        return z;
    }
    static String combine(String name, String sent)
    {
        String word;
        word = name + sent;
        return word;
    }

    static void print(){
        System.out.println("Surat is a Smart city");
    }
    static void change(int arr[]){
        arr[0] = 43;
    }

    static void ryzen(){
        System.out.println("The best processor in world");
    }
    static void ryzen(String not) {
        System.out.println("The best processor " + not + " in world");
    }
    static void ryzen(String not,String best){
        System.out.println("The best processor "+not+" in world or "+best+ " in world");
    }

    static int sum(int ...arr){
        int result = 0;
        for (int a:arr){
            result += a;
        }
        return result;
    }

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    static int factorial1(int n){
        int product = 1;
        for (int i=1; i<=n; i++){
            product *= i;
        }
        return product;
    }
    static int fibonnaci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonnaci(n-1)+fibonnaci(n-2);
        }
    }

    public static void main(String[] args){
//        int a=10;
//        int b=34;
//        int c;
//        c = add(a, b);
//        System.out.println(c);
//
//        String name = "Ajju";
//        String sent = "Is live in Surat";
//        String word;
//        word = combine(name, sent);
//        System.out.println(word);
//        print();

//        int arr[]={12,43,54,76};
//        change(arr);
//        System.out.println(arr[0]);
//        String not = "Exist";
//        String best = "Best";
//        ryzen();
//        ryzen(not);
//        ryzen(not, best);

//        System.out.println("The sum = "+sum(24, 32));
//        System.out.println("The sum = "+sum(24, 32, 45));
//        System.out.print("The sum = "+sum(24, 32, 45, 56));

        int n=3;
        System.out.println(factorial(n));
        System.out.println(factorial1(n));
        System.out.println(fibonnaci(n));
    }
}
