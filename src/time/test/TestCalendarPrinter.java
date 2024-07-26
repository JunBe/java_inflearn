package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);

        int startDay = date.getDayOfWeek().getValue();
        int lastDay = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        System.out.println(date.getDayOfWeek().getValue());
        System.out.println(date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth());
        System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
        for (int i = 0; i < startDay; i++) {
            System.out.printf("    ");
        }

        for (int i = 1; i <= lastDay; i++) {
            System.out.print(i+"  ");
            if(i<10){
                System.out.print(" ");
            }
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }

    }
}
