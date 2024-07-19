package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //일부 대문자
        String str2 = "hello, java!"; //모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); //false
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); //true

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); //1
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3)); //-1?
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); //0

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!"));
    }
}
