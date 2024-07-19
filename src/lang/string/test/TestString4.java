package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0,str.length() - 4);
        String extname = str.substring(str.length() - 4);
        System.out.println("filename = " + filename);
        System.out.println("extname = " + extname);
    }
}
