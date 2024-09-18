import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>(6, 0.5f);
        hash.add(45);
        hash.add(23);
        hash.add(67);
        hash.add(50);
        hash.add(50);
        hash.add(100);
        System.out.println(hash.isEmpty());
        System.out.println(hash.size());
        System.out.println(hash.iterator()  );

        System.out.println(hash);

    }
}
