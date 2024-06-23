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
            return daysOfLeaves;
        }
        return 0;
    }

    public static void main(String[] args) {
        var leave = new Leave();
        System.out.println(leave.numberOfLeavesDays());
    }
}
