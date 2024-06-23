import org.entreprise.Salary;
import org.entreprise.categories.Normal;
import org.entreprise.employee.Employee;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeTest {
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
