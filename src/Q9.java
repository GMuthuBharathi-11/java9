import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

    public class Q9
    {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(111);
            list.add(222);
            list.add(333);
            list.add(444);

//        List.copyOf(list).add(1);
            System.out.println("Unmodifiable List:");
            list.stream()
                .filter(e->e>111)
                .collect(Collectors.toUnmodifiableList()).forEach(System.out::println);

        }
    }

