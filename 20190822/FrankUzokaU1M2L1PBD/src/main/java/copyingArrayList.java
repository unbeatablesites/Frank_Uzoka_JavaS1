import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

public class copyingArrayList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>();

        Random ran = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(i, ran.nextInt(100));
        }

        for (int i = 0; i < numbers.size(); i++) {
            numbers1.add(i, numbers.get(i));
        }

        numbers.set((numbers.size()-1),-7);


        System.out.println("ArrayList 1: " + numbers);

        System.out.println("ArrayList 2: " + numbers1);

    }
}