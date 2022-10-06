import java.util.stream.IntStream;
public class Q4
{
    public static void main(String[] args) {
        System.out.println("Stream using Iterate:");
        IntStream
                .iterate(0,i->i<=10,i->i+2)
                .forEach(System.out::println);

    }
}
