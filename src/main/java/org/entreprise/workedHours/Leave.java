package org.entreprise.workedHours;

import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Leave {
    private String reasons;
    private LocalDate startDate;
    private LocalDate endDate;

    public Leave() {
        this.reasons = "";
        this.startDate = null;
        this.endDate = null;
    }

    public int numberOfLeavesDays(){
        if(startDate != null && endDate != null){
            int daysOfLeaves = (int) ChronoUnit.DAYS.between(startDate, endDate);
            return daysOfLeaves + 1;
        }
        return 0;
    }
}
