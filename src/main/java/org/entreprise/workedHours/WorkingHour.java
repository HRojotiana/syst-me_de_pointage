package org.entreprise.workedHours;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public sealed class WorkingHour permits IncreasedHour, ExtraHour {
    private String name;
    private float hourlyRate;
}
