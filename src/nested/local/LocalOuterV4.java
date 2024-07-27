package nested.local;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {

            int value = 0;

            @Override
            public void print() {
                System.out.println("value= " + value);
                System.out.println("localVar= " + localVar);
                System.out.println("paramVar= " + paramVar);
                System.out.println("outInstanceVar= " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter(); // 여기서 지역변수들을 캡쳐하기 때문에 이 이후로 지역변수 변경 불가
        //만약 localVar의 값을 변경한다면?
        //localVar = 10;
        //paramVar = 20;
        //컴파일 오류 (동기화 문제)
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();
    }
}
