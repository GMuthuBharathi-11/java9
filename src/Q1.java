
    interface StringManipulation {
        private static String reverseString(String str) {
            return new StringBuilder(str).reverse().toString();
        }

        static String toUpperReverse(String str) {
            String upperString = str.toUpperCase();
            return reverseString(upperString);
        }
    }
    public class Q1
    {

        public static void main(String[] args) {
            System.out.println(StringManipulation.toUpperReverse("Muthubharathi"));
        }
    }


