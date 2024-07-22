package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random random = new Random();

        System.out.print("로또 번호 : ");
        for (int i = 0; i < 6; i++) {
            boolean tf = false;

            while (!tf) {
                tf = true;
                int ran = random.nextInt(45) + 1;
                lotto[i] = ran;
                for (int j = 0; j < i; j++) {
                    if (lotto[j] == ran) {
                        tf = false;
                        break;
                    }
                }
            }
        }

        for (int x : lotto) {
            System.out.print(x + " ");
        }
    }
}
