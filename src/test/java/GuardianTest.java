import org.entreprise.Salary;
import org.entreprise.categories.Guardian;
import org.entreprise.employee.Employee;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class GuardianTest {
    @Test
    public void numberOfWorkingDays(){
        var guardianSalary = new Salary(110_000);
        var guardian = new Guardian("guardian", 52, guardianSalary, 0.0);
        var guardian1 = new Employee("John", "Doe", 236547, LocalDate.of(1984, 05, 26), LocalDate.of(2023, 06, 10), LocalDate.of(2025, 06, 10), guardian);
        var startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 2);
        assertEquals(7, guardian1.getCategory().getListOfWorkingDays(startDate).size());
    }
}
