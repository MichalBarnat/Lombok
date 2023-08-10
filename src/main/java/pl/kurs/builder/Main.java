package pl.kurs.builder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //https://nullpointerexception.pl/lombok-dobre-i-slabe-strony/

        // https://devcave.pl/effective-java/wzorzec-projektowy-builder

        Student s1 = new Student("a", "b");
        Student s2 = new Student("c", "d");
        Student s3 = new Student("e", "f");

        Course course = Course.builder()
                .name("java course")
                .location("online")
                .studentList(s1)
                .studentList(s2)
                .studentList(s3)
                .build();

        System.out.println(course);

    }
}
