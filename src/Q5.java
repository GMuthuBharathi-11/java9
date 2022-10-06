import java.util.stream.IntStream;
public class Q5
{
    public static void main(String[] args) {
        IntStream
                .rangeClosed(50,80)
                .filter(e->e>54)
                .findFirst().ifPresentOrElse(
                        (e)-> System.out.println("The value is: "+e),
                        ()->System.out.println("Value does not exists")
                                            );

        IntStream
                .rangeClosed(1,10)
                .filter(e->e>80)
                .findFirst().orElseThrow();

    }
}
