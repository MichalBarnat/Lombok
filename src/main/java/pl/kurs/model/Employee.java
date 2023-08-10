package pl.kurs.model;

import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
// @NoArgsConstructor

@Getter
@Setter

@EqualsAndHashCode
@ToString(includeFieldNames = false) //, onlyExplicitlyIncluded = true)

public class Employee {
    @ToString.Exclude
    private String name;
    @EqualsAndHashCode.Exclude
    private String lastName;
    @NonNull
    private double salary;
    private final String pesel;

}
