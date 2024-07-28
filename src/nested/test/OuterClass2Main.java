package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 out = new OuterClass2();
        OuterClass2.InnerClass inner = out.new InnerClass();
        inner.hello();
    }
}
