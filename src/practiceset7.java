public class practiceset7 {
    // problem 1
//    static void multi(int n){
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d x %d = %d\n",n,i,(n*i));
//        }
//    }

    // problem 2
    static void star(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Problem 3
    static void revstar(int n){
        for (int i=n; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Problem 4
    static int natural(int n){
        if(n==1){
            return 1;
        }
        return n + natural(n-1);
    }

    // problem 5
    static int fibbo(int n){
        if(n<=1){
            return n;
    }
        else
        {
            return fibbo(n-1)+fibbo(n-2);
        }
    }

    public static void main(String[] args){
        int n=4;
//        multi(n);
//        star(n);
//        revstar(n);
//        int c=natural(n);
//        System.out.println(c);
//        System.out.println(fibbo(n));

    }
}
