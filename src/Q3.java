import java.util.stream.IntStream;
    public class Q3
    {
        public static void main(String[] args) {
            System.out.println("Without rangeClosed on {50-80}:");
            IntStream.range(50,80).forEach(System.out::println);
            System.out.println("Without rangeClosed on {50-80}:");
            IntStream.rangeClosed(50,80).forEach(System.out::println);

        }
    }

