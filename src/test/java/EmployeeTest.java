import org.entreprise.Salary;
import org.entreprise.categories.Normal;
import org.entreprise.employee.Employee;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeTest {
    @Test
    public void listOfWorkingDays(){
        var normalSalary = new Salary(100_000);
        var normalCategory = new Normal("normal category", 40, normalSalary , 0.0);
        var normalEmployee = new Employee("Rakoto", "Rabe", 6789, LocalDate.of(1998, 02, 12), LocalDate.of(2022, 12, 12), LocalDate.of(2024, 12, 12), normalCategory);
        var startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 24);

        var day1 = Calendar.getInstance();
        day1.set(2024, Calendar.JUNE, 24);
        var day2 = Calendar.getInstance();
        day2.set(2024, Calendar.JUNE, 27);
        var day3 = Calendar.getInstance();
        day3.set(2024, Calendar.JUNE, 28);

        var simpleDateFormat = new SimpleDateFormat("EEEE d MMMM yyyy", Locale.ENGLISH);
        String day1Formatted = simpleDateFormat.format(day1.getTime());
        String day2Formatted = simpleDateFormat.format(day2.getTime());
        String day3Formatted = simpleDateFormat.format(day3.getTime());

        List<String> workingDays = new ArrayList<>();
        workingDays.add(day1Formatted);
        workingDays.add(day2Formatted);
        workingDays.add(day3Formatted);

        assertEquals(workingDays, normalEmployee.getCategory().getListOfWorkingDays(startDate));
    }
    @Test
    public void numberOfWorkingDays(){
        var normalSalary = new Salary(100_000);
        var normalCategory = new Normal("normal category", 40, normalSalary , 0.0);
        var normalEmployee = new Employee("Rakoto", "Rabe", 6789, LocalDate.of(1998, 02, 12), LocalDate.of(2022, 12, 12), LocalDate.of(2024, 12, 12), normalCategory);
        var startDate = Calendar.getInstance();
        startDate.set(2024, Calendar.JUNE, 24);
        assertEquals(3, normalEmployee.getCategory().getListOfWorkingDays(startDate).size());
    }
}
