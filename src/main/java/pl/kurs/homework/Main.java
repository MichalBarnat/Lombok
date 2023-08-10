package pl.kurs.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Beer tatra = Beer.builder()
                .brand("Tatra")
                .price(3.80)
                .foamQuality(3)
                .ingredientList(Arrays.asList("woda", "chmiel"))
                .alcoholContent(4.0)
                .build();

        Beer tatra2 = Beer.builder()
                .brand("Tatra")
                .price(3.80)
                .foamQuality(3)
                .ingredientList(Arrays.asList("woda", "chmiel"))
                .alcoholContent(5.0)
                .build();

        Beer garage = Beer.builder()
                .brand("Garage")
                .price(5.8)
                .foamQuality(6)
                .ingredientList("woda")
                .ingredientList("chmiel")
                .ingredientList("sok")
                .alcoholContent(5.2)
                .build();

        System.out.println(tatra);
        System.out.println(garage);

        Drinker mietek = Drinker.builder()
                .name("Mieczysław")
                .surname("Rzepka")
                .beerList(Beer.builder()
                        .brand("warka")
                        .price(5)
                        .foamQuality(4)
                        .ingredientList("woda")
                        .ingredientList("alkohol")
                        .alcoholContent(4.5)
                        .build())
                .beerList(tatra)
                .build();

        System.out.println(mietek);
        System.out.println(mietek.getBeerList());

        System.out.println(tatra.equals(tatra2));
    }
}
