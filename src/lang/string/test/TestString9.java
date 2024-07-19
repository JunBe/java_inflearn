package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] id = email.split("@");
        System.out.println("ID: " + id[0]);
        System.out.println("Domain: " + id[1]);
    }
}
