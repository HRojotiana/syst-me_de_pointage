import org.entreprise.Pointing;
import org.entreprise.Salary;
import org.entreprise.calendar.MonthCalendar;
import org.entreprise.categories.Guardian;
import org.entreprise.employee.Employee;
import org.entreprise.workedHours.IncreasedHour;
import org.entreprise.workedHours.NightShift;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class GuardianTest {
    @Test
    public void number_of_working_days(){
        var guardianSalary = new Salary(110_000);
        var guardian = new Guardian("guardian", 52, guardianSalary, 0.0);
        var guardian1 = new Employee("John", "Doe", 236547, LocalDate.of(1984, 05, 26), LocalDate.of(2023, 06, 10), LocalDate.of(2025, 06, 10), guardian);
        var startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 2);
        assertEquals(7, guardian1.getCategory().getListOfWorkingDays(startDate).size());
    }

    @Test
    public void number_of_working_hours_of_rakoto_in_june(){
        var guardianSalary = new Salary(110_000);
        var guardian = new Guardian("guardian", 56, guardianSalary, 0.0);
        var rakoto = new Employee("Rakoto", "Randria", 236874, LocalDate.of(1998, 03, 05), LocalDate.of(2022, 01,  03), LocalDate.of(2025, 01, 03), guardian);

        var june = new MonthCalendar();

        var nightShift = new NightShift(0);
        var rakotoPointing = new Pointing(rakoto, june, nightShift);

        var startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 1);

        assertEquals(240, rakotoPointing.countAllWorkingHours(startDate));
    }

    @Test
    public void number_of_working_hours_of_rabe_in_june(){
        var guardianSalary = new Salary(110_000);
        var guardian = new Guardian("guardian", 56, guardianSalary, 0.0);
        var rabe = new Employee("Rabe", "Andria", 2145874, LocalDate.of(1984, 02, 12), LocalDate.of(2023, 01, 23), LocalDate.of(2025, 01, 23), guardian);

        var june = new MonthCalendar();

        var nightShift = new NightShift(10);

        var rabePointing = new Pointing(rabe, june, nightShift);
        rabePointing.getNightShift().equals(nightShift);

        var startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 1);

        rabe.getCategory().getListOfWorkingDays(startDate).isEmpty();

        assertEquals(300, rabePointing.countAllWorkingHours(startDate));
    }
}
