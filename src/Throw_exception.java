class NegativeException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be Negative!";
    }
}

public class Throw_exception {
    public static double area(int r) throws NegativeException {
        if (r < 0) {
            throw new NegativeException();
        }
            double result = Math.PI * r * r;
            return result;
    }

public static int divide(int a, int b) throws ArithmeticException{
        int result = a/ b;
        return result;
    }

    public static void main(String[] args) {
        try {
//            int c = divide(2, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
