public class PalindromNumber {

    public static boolean isPalindrom(int number){
        int actualnumber = number;
        int reversenumnber = 0;

        while(number != 0){
            int digit = number % 10;
            reversenumnber = reversenumnber * 10 + digit;
            number /= 10;
        }
        return actualnumber == reversenumnber;
    }
    public static void main(String[] args){
        int number = 1001;

        if(isPalindrom(number)){
            System.out.println("Yes this a palindrom number "+number);
        }
        else {
            System.out.println("No its not a palindrom number "+number);
        }
    }
}
