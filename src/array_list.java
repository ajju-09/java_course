import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        l2.add(11);
        l2.add(13);
        l2.add(16);

        l1.addAll(l2);
        System.out.println(l1.contains(1));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(16));
        l1.set(2, 34);

        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
