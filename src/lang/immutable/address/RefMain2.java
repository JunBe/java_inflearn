package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울"); //x001
        ImmutableAddress b = a; //참조값 대입을 막을 수 있는 방법이 없다. //x001
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); //불변객체이므로 값 변경 불가
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
