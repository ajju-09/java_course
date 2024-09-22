import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(34);
        l1.add(56);
        l1.add(67);
        l1.add(23);


        l1.addLast(100);
        l1.addFirst(10);
        System.out.println(l1.contains(56));
        System.out.println(l1.indexOf(67));
        System.out.println(l1.lastIndexOf(23));

        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
