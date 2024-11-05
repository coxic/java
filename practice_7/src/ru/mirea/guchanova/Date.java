package ru.mirea.guchanova;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Текущий год:" + year);
        System.out.println("Текущий месяц:" + month);
        System.out.println("Текущий день:" + day);

        cal.setTimeInMillis(1234567898765L);
        year = cal.get(Calendar.YEAR);
        month = cal.get(Calendar.MONTH) + 1;
        day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Год 1234567898765L:" + year);
        System.out.println("Месяц 1234567898765L:" + month);
        System.out.println("День 1234567898765L:" + day);

    }
}
