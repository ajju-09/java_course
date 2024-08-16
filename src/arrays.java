public class arrays {
    public static void main(String[] args){
//        int []marks = new int[5];
//        int []marks = {23,45,20,56};
//        System.out.println("length of an array:" +marks.length);
//        marks[0] = 53;
//        marks[1] = 25;
//        marks[2] = 87;
//        marks[3] = 23;
//        marks[4] = 30;
//        for (int i=0; i<marks.length; i++)
//        {
//            System.out.println(marks[i]);
//        }

//        String name[] = {"Ajju", "Jugal", "Harshuu", "Bunty"};

//        for (int i=0; i< name.length; i++)
//        {
//            System.out.println(name[i]);
//        }
//        for (int i=name.length-1; i>=0; i--)
//        {
//            System.out.println(name[i]);
//        }
//        for (String element: name){
//            System.out.println(element);
//        }

        //2-D array
        int array[][];
        array = new int[2][3];
        array[0][0]=101;
        array[0][1]=102;
        array[0][2]=103;
        array[1][0]=104;
        array[1][1]=105;
        array[1][2]=106;

        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
