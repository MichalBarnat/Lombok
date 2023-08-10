package pl.kurs.model;

import lombok.NonNull;
import lombok.ToString;

@ToString(callSuper = true)

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, String lastName, @NonNull double salary, String pesel, double bonus) {
        super(name, lastName, salary, pesel);
        this.bonus = bonus;
    }

    public Manager(@NonNull double salary, String pesel, double bonus) {
        super(salary, pesel);
        this.bonus = bonus;
    }
}
