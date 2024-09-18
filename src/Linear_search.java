public class Linear_search {

    public static int linearSearch(int[] array, int target){
        for(int i=0; i< array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int result = linearSearch(numbers, target);

        if(result != -1){
            System.out.println("Element found at " +result);
        }
        else {
            System.out.println("Elements is not in array");
        }
    }
}
