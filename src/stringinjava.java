import java.util.Scanner;
class StringBuilder{
    StringBuilder(){

    }
    StringBuilder(String str){

    }
    StringBuilder(int length){

    }
}
public class stringinjava {
    public static void main(String[] args)
    {
//        String name = new String("Ajju");
//        String name;
//        name = "Ajju";
//        System.out.println(name);

//        Scanner s = new Scanner(System.in);
//        String name = s.nextLine();
//        System.out.println(name);
        // Methods in string
        String name = "Ajinkya";

//        String lower = name.toLowerCase();
//        String upper = name.toUpperCase() ;

//        System.out.println(upper);
//        System.out.println(lower);

//        String trim = "    Ajju     ";
//        System.out.println(trim.trim());

//        int value = name.length();
//        System.out.println(value);

//        System.out.println(name.substring(3));
//        System.out.println(name.substring(2,4));

//        System.out.println(name.replace('C','M'));
//        System.out.println(name.startsWith("Aj"));
//        System.out.println(name.endsWith("ya"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("nk"));
        System.out.println(name.indexOf("k",4));
        System.out.println(name.equals("Ajinkya"));
        System.out.println(name.equalsIgnoreCase("ajinkya"));
 }
}
