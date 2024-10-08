public class practiceset6 {
    public static void main(String[] args){
        //Problem 1
//        float array[]={20.0f,30.2f,40.4f,50.7f,60.2f};
//        float sum = 0;
//        for (float element: array){
//            sum =sum+element;
//        }
//        System.out.println(sum);

        // Problem 2
//        int array[]={11,22,33,44,55};
//        int find=12;
//        boolean isArray = false;
//        for(int element: array) {
//            if (find == element) {
//                isArray = true;
//                break;
//            }
//        }
//            if(isArray){
//                System.out.println("The number "+find+" is present in array");
//            }
//            else {
//                System.out.println("The number "+find+" is not present in array");
//            }

            // Problem 3
//        int marks[]={45,40,41,52,76};
//        int sum=0;
//        for(int elements: marks){
//            sum = sum +elements;
//        }
//        System.out.println("The average marks in Physics "+(sum)/(marks.length));

        //Problem 4
//        int mat1[][] ={{1,4,7},{2,8,3}};
//        int mat2[][] ={{10,33,27},{22,68,13}};
//        int result[][] ={{0,0,0},{0,0,0}};
//
//        for(int i=0; i<mat1.length; i++){
//            for(int j=0; j<mat1[i].length; j++){
//                result[i][j] = mat1[i][j] + mat2[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println("");
//        }

        //Problem 5
//        int array[]={11,22,33,44,55,66,77};
//        int n = Math.floorDiv(array.length, 2);
//        int l = array.length;
//        for(int i=0; i<n; i++){
//            int temp;
//            temp = array[i];
//            array[i] = array[l-1-i];
//            array[l-1-i] = temp;
//        }
//        for (int element: array){
//            System.out.print(element+" ");
//        }

        // Problem 6
//        int arr[]={34,45,13,57,24};
//        int max=0;
//        for (int e:arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println(max);

        // Problem 7
//        int arr[]={24,56,73,13,10};
//        int min=Integer.MAX_VALUE;
//        for(int e:arr){
//            if(e<min){
//                min = e;
//            }
//        }
//        System.out.println(min);

        // Problem 8
        int arr[]={11,22,33,66};
        boolean shorted = true;
        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                shorted = false;
                break;
            }
        }
        if(shorted){
            System.out.println("The array is shorted");
        }
        else{
            System.out.println("The array is not shorted");
        }

    }
}
