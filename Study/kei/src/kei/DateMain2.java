package kei;

import java.time.LocalDateTime;

public class DateMain2 {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getMonthValue() + "月");

        ldt = ldt.withMonth(12);
        System.out.println(ldt.getMonthValue() + "月");
    }
}