import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Q2
    {

        public static void main(String[] args) {


            System.out.println("TakeWhile number is <25 using takeWhile: ");
            System.out.println(IntStream
                                       .rangeClosed(30,50)
                                       .takeWhile(x->x<=25)
                                       .boxed()
                                       .collect(Collectors.toList()));

            System.out.println("DropWhile number is <25 using dropWhile: ");
            System.out.println(IntStream
                                       .rangeClosed(30,50)
                                       .dropWhile(x->x<=25)
                                       .boxed()
                                       .collect(Collectors.toList()));

        }
    }


