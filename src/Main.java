public class Main {
    public static void main(String[] args) {
        // String pool checking

        String str1 = "hey";
        String str2 = "hey";

        System.out.println(str1==str2);

        String s1 = new String("Hi");
        String s2 = new String("Hi");

        System.out.println(s1==s2);

        System.out.println(str1);
        System.out.println(str2);

        
    }
}

