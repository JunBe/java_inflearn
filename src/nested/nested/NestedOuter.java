package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedinstanceValue = 1;

        public void print() {
            System.out.println(nestedinstanceValue);

//            System.out.println(outInstanceValue);

            System.out.println(outClassValue);
        }
    }
}
