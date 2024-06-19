import org.entreprise.employé.Employé;
import org.entreprise.Salaire;
import org.entreprise.catégories.Normal;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaireInitialTest {
    @Test
    public void salaireNormal(){
        var salaireNormal = new Salaire(100_000);
        assertEquals(80_000, salaireNormal.getSalaireNet());
    }
    @Test
    public void salaireEmployéNormal(){
        var salaireNormal = new Salaire(100_000);
        var catégorieNormale = new Normal("catégorie normale", 40, salaireNormal, 0);
        var employéNormal1 = new Employé("Randria", "Rabe", LocalDate.of(1989, 9, 12), LocalDate.of(2022, 10, 23), LocalDate.of(2024, 10, 23),  catégorieNormale);
        assertEquals(salaireNormal.getSalaireBrut(), employéNormal1.getCatégorie().getSalaireNormal().getSalaireBrut());
        assertEquals(salaireNormal.getSalaireNet(), employéNormal1.getCatégorie().getSalaireNormal().getSalaireNet());
    }
}
