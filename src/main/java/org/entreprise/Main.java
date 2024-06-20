package org.entreprise;

import org.entreprise.calendar.MonthCalendar;
import org.entreprise.categories.Category;
import org.entreprise.categories.Guardian;
import org.entreprise.categories.Normal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Salary guardianSalary = new Salary(110_000);
        Guardian guardian = new Guardian("guardian", 56, guardianSalary, 0);
        Calendar startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 2);
        System.out.println(guardian.getListOfWorkingDays(startDate));
    }
}