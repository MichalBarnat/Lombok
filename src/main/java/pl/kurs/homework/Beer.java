package pl.kurs.homework;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames = false, onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Builder
public class Beer {
    @ToString.Include
    @EqualsAndHashCode.Include
    private final String brand;
    @ToString.Include
    @EqualsAndHashCode.Include
    private double price;
    private int foamQuality;
    @Singular("ingredientList")
    private List<String> ingredientList;
    private double alcoholContent;
}
