package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month = sc.nextInt();
        CalendarPrint(year, month);

    }

    private static void CalendarPrint(int year, int month) {
        System.out.println("Su Mo Tu We Th Fr Sa");
        LocalDate date = LocalDate.of(year, month, 1);

        int startDay = date.getDayOfWeek().getValue() % 7;
        LocalDate firstdayNextMonth = date.plusMonths(1);

        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        while (date.isBefore(firstdayNextMonth)) {
            System.out.printf("%2d ", date.getDayOfMonth());
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            date = date.plusDays(1);
        }

    }
}
