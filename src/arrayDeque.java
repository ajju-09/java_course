import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad1.add(11);
        ad1.add(22);
        ad1.add(33);
        ad1.add(44);
        ad1.addFirst(10);
        ad1.addLast(55);

        ad2.add(1);
        ad2.add(2);
        ad2.add(3);

        ad1.addAll(ad2);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
