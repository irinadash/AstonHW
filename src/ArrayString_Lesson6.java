public class ArrayString_Lesson6 {

    public static void main(String[] args) {


        String str = "Hello world!";
        System.out.println(str.substring(7, 9));
        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.charAt(6));
        System.out.println(str.equals("xxx"));// false
        System.out.println(str.equals("Hello world!")); // true
        System.out.println(str.compareTo("AAAA"));
    }
}
