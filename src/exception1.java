public class exception1 {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try{
            int c = a/b;
            System.out.println("The result is "+c);
        }
        catch (Exception e){
            System.out.println("Failed to divide");
            System.out.println(e);
        }
        System.out.println("Program End here");
    }
}
