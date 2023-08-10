package pl.kurs.homework;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString(includeFieldNames = false)

@Builder
public class Drinker {
    private String name;
    private String surname;
    @ToString.Exclude
    @Singular("beerList")
    private List<Beer> beerList;

    public void buyBeer(Beer beer) {
        if(beer == null) {
            throw new IllegalArgumentException("Beer not exist! :(");
        }
        beerList.add(beer);
    }
}
