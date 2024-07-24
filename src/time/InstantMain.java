package time;

import java.time.Instant;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant now = Instant.now(); //UTC 기준
        System.out.println("now = " + now);
    }
}
