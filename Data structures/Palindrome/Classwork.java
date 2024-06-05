public class Classwork {
    public static void main(String[] args) {
        String text = "text";
        String reversed = reverseText(text);
        System.out.println(reversed);
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

